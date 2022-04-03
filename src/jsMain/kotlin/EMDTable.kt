package ru.mipt.npm.nica.emd

import csstype.pct
import kotlinext.js.jso
import react.Props
import react.dom.*
import react.fc
import kotlin.js.Json
import mui.material.*
import mui.x.DataGrid


external interface EMDTableProps : Props {
    var content: String?
    var pageConfig: PageConfig
}

val EMDTable = fc<EMDTableProps> { props ->

    if (props.content != null) {

        fun column(field: String, key: String /* TODO check */, headerName: String,flex: Int, minWidth: Int): dynamic {
            val r: dynamic = object {}
            r["field"] = field
            r["key"] = key
            r["headerName"] = headerName
            r["flex"] = flex
            r["minWidth"] = minWidth
            return r
        }

        val columns = mutableListOf(
            column("storage_name", "storage_name", "Storage", 1, 100),
            column("file_path", "file_path", "File path", 3, 260),
            column("event_number", "event_number", "# Event", 1, 150),
            column("software_version", "software_version", "Software", 2, 100),
            column("period_number", "period_number", "Period", 1, 100),
            column("run_number", "run_number", "# Run", 1, 150)
        )

        props.pageConfig.parameters.forEach { it ->
            columns.add(column(it.name, it.name, it.web_name, 2, 150))
        }

        fun row(
            id: Int,
            storage_name: String,
            file_path: String,
            event_number: Int,
            software_version: String,
            period_number: String,
            run_number: String,
            params: Json
        ): dynamic {
            val r: dynamic = object {}
            r["id"] = id
            r["storage_name"] = storage_name
            r["file_path"] = file_path
            r["event_number"] = event_number
            r["software_version"] = software_version
            r["period_number"] = period_number
            r["run_number"] = run_number

            props.pageConfig.parameters.forEach { it ->
                val paramName = it.name
                val paramValue = params[paramName]
                r[paramName] = paramValue.toString()  // TODO types
            }
            return r
        }

        //console.log(props.content)
        val json = JSON.parse<Json>(props.content!!)
        //console.log(json["events"])
        val events = json["events"].unsafeCast<Array<Json>>()

        val rows = mutableListOf<dynamic>()

        var id: Int = 1
        events.forEach { event ->

            // console.log(event)
            val ref = event["reference"].unsafeCast<Json>()
            val event_number = ref["event_number"].toString().toInt()
            val file_path = ref["file_path"]
            val storage_name = ref["storage_name"]

            rows.add(
                row(
                    id++,
                    storage_name.toString(),
                    file_path.toString(),
                    event_number,
                    event["software_version"].toString(),
                    event["period_number"].toString(),
                    event["run_number"].toString(),
                    // All other params
                    event["parameters"].unsafeCast<Json>()
                )
            )

        }


        div("div-emd-table-card") {
            Card {
                DataGrid {
                    attrs {
                        this.columns = columns.toTypedArray()
                        this.rows = rows.toTypedArray()
                        pageSize = 10
                        // TODO https://mui.com/components/data-grid/pagination/
//                    rowsPerPageOptions = arrayOf(10, 20, 30)
//                    onPageSizeChange = { newPageSize: Int ->
//                        this.setPageSize(newPageSize)
//                    }
//                    columnBuffer = 8

                    }

                }
            }
        }
    }

    else {
        Card {
            h3 {
                + "No data"
            }
        }
    }


    /* div("lightgreen") {

        if (props.content != null) {
            table {
                caption {
                    +"EMD Table component:"
                }
                thead {
                    tr {
                        th { +"Storage name" }
                        th { +"File path" }
                        th { +"Event number" }
                        th { +"Software" }
                        th { +"Period" }
                        th { +"Run" }
                        props.pageConfig.parameters.forEach { it ->
                            th {
                                +it.name
                            }
                        }
                    }
                }
                tbody {
                    //console.log(props.content)
                    val json = JSON.parse<Json>(props.content!!)
                    //console.log(json["events"])
                    val events = json["events"].unsafeCast<Array<Json>>()
                    events.forEach { event ->
                        tr {
                            // console.log(event)
                            val ref = event["reference"].unsafeCast<Json>()
                            val event_number = ref["event_number"]
                            val file_path = ref["file_path"]
                            val storage_name = ref["storage_name"]

                            td { +storage_name.toString() }
                            td { +file_path.toString() }
                            td { +event_number.toString() }
                            td { +event["software_version"].toString() }
                            td { +event["period_number"].toString() }
                            td { +event["run_number"].toString() }


                            props.pageConfig.parameters.forEach { it ->
                                val param_value = event["parameters"].unsafeCast<Json>()[it.name]
                                td { +param_value.toString() }
                            }

                        }
                    }
                }
            }

        } else {
            h3 {
                +"Empty EMD data"
            }
        }
    } */

}

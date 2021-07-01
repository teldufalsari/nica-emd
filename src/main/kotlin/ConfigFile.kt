package com.example

class ConfigFile(
    val event_db: DBConnectionConfig,
    val condition_db: DBConnectionConfig?,
    val title: String,
    val pages: List<PageConfig>
)

class DBConnectionConfig(
    val host: String,
    val port: Int,
    val db_name: String,
    val user: String,
    val password: String
)

class PageConfig(
    val name: String,
    val api_url: String,
    val web_url: String,
    val db_table_name: String,
    val parameters: List<ParameterConfig>
)

class ParameterConfig(
    val name: String,
    val type: String,  // TODO
    val intervals: Boolean,
    val web_name: String
)

package ru.mipt.npm.nica.emd

import kotlinx.html.DIV
import react.dom.RDOMBuilder
import react.dom.div

// see e.g. https://stackoverflow.com/questions/48596379/how-to-use-svg-with-kotlin-react

//class SVGPathAttrs (
//    val fillRule: String,
//    val clipRule: String,
//    val d: String
//): Props {}

// and https://stackoverflow.com/questions/39758136/render-html-string-as-real-html-in-a-react-component

fun RDOMBuilder<DIV>.dangerousSVG(htmlContent: String) {
    div {
        attrs["dangerouslySetInnerHTML"] = object {
            val __html = htmlContent
        }
    }
}

fun SVGSearchEventsDANG(fill: String) = """
    <svg class="search__svg" width="29" height="29" viewBox="0 0 29 29" xmlns="http://www.w3.org/2000/svg" fill="$fill">
      <path
        fill-rule="evenodd" clip-rule="evenodd"
        d="M10.5643 21.5688V19.2384C10.5643 19.1251 10.5278 19.0321 10.455 18.9592C10.3822 18.8864 10.2891 18.85 10.1759 18.85H6.29193C6.17865 18.85 6.0856 18.8864 6.01278 18.9592C5.93995 19.0321 5.90354 19.1251 5.90354 19.2384V21.5688C5.90354 21.682 5.93995 21.7751 6.01278 21.8479C6.0856 21.9207 6.17865 21.9571 6.29193 21.9571H10.1759C10.2891 21.9571 10.3822 21.9207 10.455 21.8479C10.5278 21.7751 10.5643 21.682 10.5643 21.5688ZM10.5643 16.908V14.5777C10.5643 14.4644 10.5278 14.3713 10.455 14.2985C10.3822 14.2257 10.2891 14.1893 10.1759 14.1893H6.29193C6.17865 14.1893 6.0856 14.2257 6.01278 14.2985C5.93995 14.3713 5.90354 14.4644 5.90354 14.5777V16.908C5.90354 17.0213 5.93995 17.1144 6.01278 17.1872C6.0856 17.26 6.17865 17.2964 6.29193 17.2964H10.1759C10.2891 17.2964 10.3822 17.26 10.455 17.1872C10.5278 17.1144 10.5643 17.0213 10.5643 16.908ZM16.7785 21.5688V19.2384C16.7785 19.1251 16.7421 19.0321 16.6693 18.9592C16.5965 18.8864 16.5034 18.85 16.3902 18.85H12.5062C12.3929 18.85 12.2999 18.8864 12.2271 18.9592C12.1542 19.0321 12.1178 19.1251 12.1178 19.2384V21.5688C12.1178 21.682 12.1542 21.7751 12.2271 21.8479C12.2999 21.9207 12.3929 21.9571 12.5062 21.9571H16.3902C16.5034 21.9571 16.5965 21.9207 16.6693 21.8479C16.7421 21.7751 16.7785 21.682 16.7785 21.5688ZM10.5643 12.2474V9.91699C10.5643 9.80371 10.5278 9.71066 10.455 9.63784C10.3822 9.56501 10.2891 9.5286 10.1759 9.5286H6.29193C6.17865 9.5286 6.0856 9.56501 6.01278 9.63784C5.93995 9.71066 5.90354 9.80371 5.90354 9.91699V12.2474C5.90354 12.3606 5.93995 12.4537 6.01278 12.5265C6.0856 12.5993 6.17865 12.6357 6.29193 12.6357H10.1759C10.2891 12.6357 10.3822 12.5993 10.455 12.5265C10.5278 12.4537 10.5643 12.3606 10.5643 12.2474ZM16.7785 16.9081V14.5777C16.7785 14.4644 16.7421 14.3714 16.6693 14.2985C16.5965 14.2257 16.5034 14.1893 16.3902 14.1893H12.5062C12.3929 14.1893 12.2999 14.2257 12.2271 14.2985C12.1542 14.3714 12.1178 14.4644 12.1178 14.5777V16.9081C12.1178 17.0213 12.1542 17.1144 12.2271 17.1872C12.2999 17.26 12.3929 17.2965 12.5062 17.2965H16.3902C16.5034 17.2965 16.5965 17.26 16.6693 17.1872C16.7421 17.1144 16.7785 17.0213 16.7785 16.9081ZM22.9928 21.5688V19.2384C22.9928 19.1251 22.9564 19.0321 22.8836 18.9593C22.8108 18.8864 22.7177 18.85 22.6044 18.85H18.7205C18.6072 18.85 18.5142 18.8864 18.4414 18.9593C18.3685 19.0321 18.3321 19.1251 18.3321 19.2384V21.5688C18.3321 21.6821 18.3685 21.7751 18.4414 21.8479C18.5142 21.9208 18.6072 21.9572 18.7205 21.9572H22.6044C22.7177 21.9572 22.8108 21.9208 22.8836 21.8479C22.9564 21.7751 22.9928 21.6821 22.9928 21.5688ZM16.7785 12.2474V9.91702C16.7785 9.80374 16.7421 9.71069 16.6693 9.63787C16.5965 9.56504 16.5034 9.52863 16.3902 9.52863H12.5062C12.3929 9.52863 12.2999 9.56504 12.2271 9.63787C12.1542 9.71069 12.1178 9.80374 12.1178 9.91702V12.2474C12.1178 12.3607 12.1542 12.4537 12.2271 12.5265C12.2999 12.5994 12.3929 12.6358 12.5062 12.6358H16.3902C16.5034 12.6358 16.5965 12.5994 16.6693 12.5265C16.7421 12.4537 16.7785 12.3607 16.7785 12.2474ZM22.9928 16.9081V14.5777C22.9928 14.4645 22.9564 14.3714 22.8836 14.2986C22.8108 14.2258 22.7177 14.1893 22.6044 14.1893H18.7205C18.6072 14.1893 18.5142 14.2258 18.4414 14.2986C18.3685 14.3714 18.3321 14.4645 18.3321 14.5777V16.9081C18.3321 17.0214 18.3685 17.1144 18.4414 17.1873C18.5142 17.2601 18.6072 17.2965 18.7205 17.2965H22.6044C22.7177 17.2965 22.8108 17.2601 22.8836 17.1873C22.9564 17.1144 22.9928 17.0214 22.9928 16.9081ZM22.9928 12.2474V9.91702C22.9928 9.80374 22.9564 9.71069 22.8836 9.63787C22.8108 9.56504 22.7177 9.52863 22.6044 9.52863H18.7205C18.6072 9.52863 18.5142 9.56504 18.4414 9.63787C18.3685 9.71069 18.3321 9.80374 18.3321 9.91702V12.2474C18.3321 12.3607 18.3685 12.4537 18.4414 12.5265C18.5142 12.5994 18.6072 12.6358 18.7205 12.6358H22.6044C22.7177 12.6358 22.8108 12.5994 22.8836 12.5265C22.9564 12.4537 22.9928 12.3607 22.9928 12.2474ZM24.5464 8.36346V21.5688C24.5464 22.1029 24.3563 22.56 23.9759 22.9403C23.5956 23.3206 23.1385 23.5108 22.6044 23.5108H6.29194C5.7579 23.5108 5.30073 23.3206 4.92043 22.9403C4.54013 22.56 4.34998 22.1029 4.34998 21.5688V8.36346C4.34998 7.82942 4.54013 7.37225 4.92043 6.99195C5.30073 6.61164 5.7579 6.42149 6.29194 6.42149H22.6044C23.1385 6.42149 23.5956 6.61164 23.9759 6.99195C24.3563 7.37225 24.5464 7.82942 24.5464 8.36346Z"
      />
    </svg>
""".trimIndent()

val SVGHeaderBubbles = """
    <svg class="square2" width="40" height="40" viewBox="0 0 40 40" fill="none" xmlns="http://www.w3.org/2000/svg">
    <path id="anim2" fill-rule="evenodd" clip-rule="evenodd"
      d="M13.1696 27.1875C13.5937 27.6004 13.8058 28.1027 13.8058 28.6942C13.8058 29.2857 13.5965 29.7907 13.178 30.2093C12.7595 30.6278 12.2545 30.8371 11.6629 30.8371C11.0826 30.8371 10.5803 30.625 10.1562 30.2009C9.73213 29.7768 9.52008 29.2746 9.52008 28.6942C9.52008 28.1027 9.72934 27.5977 10.1479 27.1791C10.5664 26.7606 11.0714 26.5513 11.6629 26.5513C12.2545 26.5513 12.7567 26.7634 13.1696 27.1875ZM21.5067 30.6362C21.9308 31.0491 22.1428 31.5513 22.1428 32.1429C22.1428 32.7344 21.9336 33.2394 21.5151 33.6579C21.0965 34.0765 20.5915 34.2857 20 34.2857C19.4085 34.2857 18.9034 34.0765 18.4849 33.6579C18.0664 33.2394 17.8571 32.7344 17.8571 32.1429C17.8571 31.5513 18.0664 31.0463 18.4849 30.6278C18.9034 30.2093 19.4085 30 20 30C20.5915 30 21.0937 30.2121 21.5067 30.6362L21.5067 30.6362ZM9.72099 18.8505C10.1451 19.2634 10.3572 19.7656 10.3572 20.3572C10.3572 20.9487 10.1479 21.4537 9.72936 21.8722C9.31083 22.2908 8.80581 22.5 8.21429 22.5C7.62277 22.5 7.11775 22.2908 6.69922 21.8722C6.28069 21.4537 6.07143 20.9487 6.07143 20.3572C6.07143 19.7656 6.28069 19.2606 6.69922 18.8421C7.11775 18.4236 7.62277 18.2143 8.21429 18.2143C8.80581 18.2143 9.30804 18.4264 9.72099 18.8505L9.72099 18.8505ZM30.4799 28.6942C30.4799 29.2746 30.2678 29.7768 29.8437 30.2009C29.4196 30.625 28.9174 30.8371 28.337 30.8371C27.7455 30.8371 27.2405 30.6278 26.822 30.2093C26.4034 29.7908 26.1942 29.2857 26.1942 28.6942C26.1942 28.1027 26.4034 27.5977 26.822 27.1791C27.2405 26.7606 27.7455 26.5513 28.337 26.5513C28.9285 26.5513 29.4336 26.7606 29.8521 27.1791C30.2706 27.5977 30.4799 28.1027 30.4799 28.6942V28.6942ZM13.5547 10.1284C14.0792 10.653 14.3415 11.2835 14.3415 12.0201C14.3415 12.7568 14.0792 13.3873 13.5547 13.9119C13.0301 14.4364 12.3996 14.6987 11.6629 14.6987C10.9263 14.6987 10.2958 14.4364 9.77121 13.9119C9.24666 13.3873 8.98438 12.7568 8.98438 12.0201C8.98438 11.2835 9.24666 10.653 9.77121 10.1284C10.2958 9.60386 10.9263 9.34158 11.6629 9.34158C12.3996 9.34158 13.0301 9.60386 13.5547 10.1284ZM33.2924 18.8505C33.7165 19.2635 33.9286 19.7657 33.9286 20.3572C33.9286 20.9487 33.7193 21.4537 33.3008 21.8723C32.8822 22.2908 32.3772 22.5001 31.7857 22.5001C31.1942 22.5001 30.6891 22.2908 30.2706 21.8723C29.8521 21.4538 29.6428 20.9487 29.6428 20.3572C29.6428 19.7657 29.8521 19.2607 30.2706 18.8421C30.6891 18.4236 31.1942 18.2143 31.7857 18.2143C32.3772 18.2143 32.8794 18.4264 33.2924 18.8505V18.8505ZM22.2768 6.29471C22.9018 6.91971 23.2143 7.67864 23.2143 8.5715C23.2143 9.46436 22.9018 10.2233 22.2768 10.8483C21.6518 11.4733 20.8929 11.7858 20 11.7858C19.1071 11.7858 18.3482 11.4733 17.7232 10.8483C17.0982 10.2233 16.7857 9.46436 16.7857 8.5715C16.7857 7.67864 17.0982 6.91971 17.7232 6.29471C18.3482 5.66971 19.1071 5.35721 20 5.35721C20.8929 5.35721 21.6518 5.66971 22.2768 6.29471ZM32.0871 12.0202C32.0871 13.0581 31.7188 13.9426 30.9821 14.6736C30.2455 15.4046 29.3638 15.7702 28.3371 15.7702C27.2991 15.7702 26.4146 15.4046 25.6836 14.6736C24.9526 13.9426 24.5871 13.0581 24.5871 12.0202C24.5871 10.9934 24.9526 10.1117 25.6836 9.37507C26.4146 8.63846 27.2991 8.27016 28.3371 8.27016C29.3638 8.27016 30.2455 8.63846 30.9821 9.37507C31.7188 10.1117 32.0871 10.9934 32.0871 12.0202Z"
      fill="#F2F2F2" />
  </svg>
""".trimIndent()

val SVGLogout = """
    <svg class="svg__out" width="33px" height="33px" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" fill="none"><path fill="currentColor" fill-rule="evenodd" d="M10.138 1.815A3 3 0 0 1 14 4.688v14.624a3 3 0 0 1-3.862 2.873l-6-1.8A3 3 0 0 1 2 17.512V6.488a3 3 0 0 1 2.138-2.873l6-1.8zM15 4a1 1 0 0 1 1-1h3a3 3 0 0 1 3 3v1a1 1 0 1 1-2 0V6a1 1 0 0 0-1-1h-3a1 1 0 0 1-1-1zm6 12a1 1 0 0 1 1 1v1a3 3 0 0 1-3 3h-3a1 1 0 1 1 0-2h3a1 1 0 0 0 1-1v-1a1 1 0 0 1 1-1zM9 11a1 1 0 1 0 0 2h.001a1 1 0 1 0 0-2H9z" clip-rule="evenodd"/><path id="anim1" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M16 12h5m0 0-2-2m2 2-2 2"/></svg>
""".trimIndent()

val SVGUserPic = """
    <svg id="Layer_1" style="enable-background:new 0 0 512 512;" version="1.1" viewBox="0 0 512 512" xml:space="preserve" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink"><style type="text/css"> .st0{fill:#ffffffde;} .st1{fill:#ffd05a;} .st2{fill:#DCC5A1;} .st3{fill:#EDD9B4;} .st4{fill-rule:evenodd;clip-rule:evenodd;fill:#BC9F82;} .st5{fill-rule:evenodd;clip-rule:evenodd;fill:#4B1F0D;} .st6{fill-rule:evenodd;clip-rule:evenodd;fill:#DCC5A1;} .st7{fill-rule:evenodd;clip-rule:evenodd;fill:#EDD9B4;} .st8{fill:#010101;} .st9{opacity:0.3;} .st10{clip-path:url(#SVGID_2_);fill:#5C3915;} .st11{clip-path:url(#SVGID_4_);fill:#5C3915;} .st12{fill-rule:evenodd;clip-rule:evenodd;fill:#EDEDED;} .st13{opacity:0.1;} .st14{clip-path:url(#SVGID_6_);fill-rule:evenodd;clip-rule:evenodd;fill:#010101;} .st15{fill:#342214;} .st16{fill:#FFFFFF;} .st17{fill:#BE1E2D;} .st18{fill:#200D45;} </style><g><path class="st0" d="M90.4,379.5c10.5-9.3,37.1-30,125.5-68.8l81,0.5c88.5,38.8,114.1,58.9,124.6,68.2c4.1,3.6,7.7,9.6,10.9,17.4   c24.7-35.1,39.2-77.9,39.2-124.1C471.7,153.6,375.1,57,256,57C136.9,57,40.3,153.6,40.3,272.8c0,46.2,14.5,89,39.2,124.1   C82.8,389.1,86.4,383,90.4,379.5z"/><path class="st1" d="M142.9,456.5c1.2-9.6,2-15.4,2-15.4s0,6.2,0,16.7c26.5,15.9,56.6,26.3,88.9,29.6l14.1-98.6l-11.1-16.3   l19.4-19.7l18.5,19.5l-10.7,16.5l14.1,98.6c32.2-3.3,62.3-13.7,88.7-29.5c0-10.5,0-16.8,0-16.8s0.8,5.9,2,15.5   c25-15.4,46.7-35.8,63.6-59.8c-3.3-7.7-6.9-13.8-10.9-17.4c-10.5-9.3-36.1-29.4-124.6-68.2l-81-0.5   c-88.5,38.8-115.1,59.5-125.5,68.8c-4.1,3.6-7.6,9.6-10.9,17.4C96.4,420.8,117.9,441.1,142.9,456.5z"/><g><path class="st2" d="M213.3,236.5v97.2c11.7,13.8,27.1,21,42.6,21.1V197.1C234.6,197.1,213.3,210.2,213.3,236.5z"/><path class="st3" d="M255.9,197.1v157.7c15.4,0.1,30.9-6.8,42.6-21.1v-97.2C298.5,210.2,277.2,197.1,255.9,197.1z"/></g><path class="st4" d="M298.5,232.6v65.1c-16.1,11.7-31.6,18.3-42.6,18.3c-10.9,0-26.5-6.6-42.6-18.3v-65.1   C213.3,180.1,298.5,180.1,298.5,232.6"/><path class="st5" d="M318.8,111.5c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.3-33.9,33.9   C284.9,96.3,300.1,111.5,318.8,111.5"/><path class="st5" d="M285.5,96.6c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C251.6,81.4,266.8,96.6,285.5,96.6"/><path class="st5" d="M234.6,91.4c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C200.6,76.1,215.9,91.4,234.6,91.4"/><path class="st5" d="M188.9,108c18.7,0,33.9-15.3,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C155,92.8,170.3,108,188.9,108"/><path class="st5" d="M162.6,145.8c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C128.7,130.5,143.9,145.8,162.6,145.8"/><path class="st5" d="M347.8,146.6c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.3-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C313.9,131.4,329.1,146.6,347.8,146.6"/><path class="st5" d="M349.5,194c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C315.6,178.8,330.9,194,349.5,194"/><path class="st5" d="M325,251.1c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C291,235.8,306.3,251.1,325,251.1"/><path class="st5" d="M160,188.8c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C126.1,173.5,141.3,188.8,160,188.8"/><path class="st5" d="M184.6,255.5c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C150.6,240.2,165.9,255.5,184.6,255.5"/><path class="st5" d="M344.7,226.5c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C310.7,211.2,326,226.5,344.7,226.5"/><path class="st5" d="M164.9,224.1c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C131,208.8,146.2,224.1,164.9,224.1"/><g><path class="st6" d="M157.5,176.1c-3.4-2.5-7.1-3.5-10.3-2.5c-7.5,2.5-10.1,15-5.8,27.9c4.3,13,13.8,21.5,21.3,19    c0.5-0.2,1-0.4,1.5-0.7c3.6,14.8,7.6,25.4,9.7,28.4c10.3,15.2,59.1,55.3,82.2,55.3V62C170.6,62,154.5,123.6,157.5,176.1z"/><path class="st7" d="M366.3,173.7c-3.8-1.3-8.1,0.3-12.1,3.9C357.6,124.7,342,62,255.9,62h0v241.7h0c23.1,0,71.9-40.2,82.2-55.3    c2.1-3.1,6.3-14.1,9.9-29.4c0.9,0.7,1.8,1.3,2.9,1.6c7.5,2.5,17-6,21.3-19C376.4,188.7,373.8,176.2,366.3,173.7z"/></g><path class="st5" d="M244.2,120.3c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C210.3,105.1,225.5,120.3,244.2,120.3"/><path class="st5" d="M290.7,118.6c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C256.8,103.3,272.1,118.6,290.7,118.6"/><path class="st5" d="M210,130.9c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C176.1,115.6,191.3,130.9,210,130.9"/><path class="st5" d="M184.8,142.7c15.9,0,28.9-13,28.9-28.9c0-15.9-13-28.9-28.9-28.9c-15.9,0-28.9,13-28.9,28.9   C155.9,129.7,168.9,142.7,184.8,142.7"/><path class="st5" d="M318,139.6c18.7,0,33.9-15.2,33.9-33.9c0-18.7-15.2-33.9-33.9-33.9c-18.7,0-33.9,15.2-33.9,33.9   C284,124.4,299.3,139.6,318,139.6"/><path class="st5" d="M345.5,162.6c13.2,0,23.9-10.8,23.9-23.9c0-13.2-10.8-23.9-23.9-23.9c-13.2,0-23.9,10.8-23.9,23.9   C321.6,151.9,332.3,162.6,345.5,162.6"/><path class="st5" d="M169.4,167.2c12.8,0,23.2-10.4,23.2-23.2c0-12.8-10.4-23.2-23.2-23.2c-12.8,0-23.2,10.4-23.2,23.2   C146.2,156.8,156.6,167.2,169.4,167.2"/><path class="st5" d="M164.6,183c8.2,0,14.8-6.7,14.8-14.8c0-8.2-6.7-14.8-14.8-14.8c-8.2,0-14.8,6.7-14.8,14.8   C149.7,176.4,156.4,183,164.6,183"/><path class="st5" d="M349.7,184.8c8.2,0,14.8-6.7,14.8-14.8c0-8.2-6.7-14.8-14.8-14.8c-8.2,0-14.8,6.7-14.8,14.8   C334.9,178.1,341.6,184.8,349.7,184.8"/><path class="st5" d="M166.3,196.2c5.8,0,10.4-4.7,10.4-10.4c0-5.7-4.7-10.4-10.4-10.4c-5.7,0-10.4,4.7-10.4,10.4   C155.9,191.5,160.6,196.2,166.3,196.2"/><path class="st5" d="M348,195.3c5.8,0,10.4-4.7,10.4-10.4c0-5.7-4.7-10.4-10.4-10.4c-5.7,0-10.4,4.7-10.4,10.4   C337.6,190.6,342.2,195.3,348,195.3"/><path class="st8" d="M349.6,171.9c-2.7-2.1-27.9-10.8-37.5-11.1c0,0-21.6-2.6-32.3,2.4c-10.7,4.9-12.9,4.2-23.3,4.7c0,0-0.4,0-1,0   c-0.7,0-1,0-1,0c-10.4-0.5-12.6,0.2-23.3-4.7c-10.7-4.9-32.3-2.4-32.3-2.4c-9.6,0.2-34.8,8.9-37.5,11.1c-2.7,2.1,0,5.5,0,5.5   c10.9-0.9,12.3,17.5,12.3,17.5c1.3,5,3.1,9.5,6,13.7c3.6,5.2,8.7,9.4,14.7,11.6c5.7,2.1,11,2.2,17.1,2.2c7.9-0.1,15.2-2.1,21.2-7.2   c11.1-9.3,14.9-33.5,14.9-33.5c-1.5-0.7-1.6-3.5-1.6-3.5c-0.1-4.1,6.4-4.5,8.5-4.5c0.3,0,0.6,0,1,0c0.4,0,0.7,0,1,0   c2,0,8.6,0.4,8.5,4.5c0,0-0.1,2.8-1.6,3.5c0,0,3.9,24.2,14.9,33.5c6,5,13.4,7.1,21.2,7.2c6.1,0.1,11.4-0.1,17.1-2.2   c6-2.2,11.1-6.4,14.7-11.6c2.9-4.2,4.8-8.8,6-13.7c0,0,1.4-18.5,12.4-17.5C349.6,177.4,352.3,174,349.6,171.9 M240.5,190.7   c-2,14.1-5.7,21.5-14.7,25.7c-9.1,4.2-17,3.5-17,3.5s-7.7,0.7-16.8-3.5c-9.1-4.2-12.5-11.6-14.5-25.7c-0.3-2.4-0.6-4.8-0.6-7.2   c0.1-6.6,3.3-13.9,9.7-16.8c4-1.8,9.4-2.4,13.7-2.7c2.8-0.2,5.7-0.4,8.5-0.4c0.9,0,1.8,0.1,2.7,0.2c7.3,0.6,16.1,0.6,22.4,4.8   c1.1,0.8,2.2,1.6,3.2,2.7C241.8,176.5,241.5,184.1,240.5,190.7 M333.4,190.7c-2,14.1-5.4,21.5-14.5,25.7   c-9.1,4.2-16.8,3.5-16.8,3.5s-7.9,0.7-17-3.5c-9.1-4.2-12.7-11.6-14.7-25.7c-0.9-6.6-1.3-14.2,3.5-19.4c1-1.1,2-1.9,3.2-2.7   c6.3-4.2,15.1-4.2,22.4-4.8c0.9-0.1,1.8-0.2,2.6-0.2c2.8,0,5.7,0.2,8.5,0.4c4.3,0.3,9.8,0.9,13.7,2.7c6.3,2.9,9.6,10.2,9.7,16.8   C334,185.8,333.8,188.3,333.4,190.7"/><g class="st9"><g><defs><rect height="56.3" id="SVGID_1_" width="64.2" x="176.9" y="163.5"/></defs><clipPath id="SVGID_2_"><use style="overflow:visible;" xlink:href="#SVGID_1_"/></clipPath><path class="st10" d="M240.5,190.7c-2,14.1-5.7,21.5-14.7,25.7c-9.1,4.2-17,3.5-17,3.5s-7.7,0.7-16.8-3.5     c-9.1-4.2-12.5-11.6-14.5-25.7c-0.3-2.4-0.6-4.8-0.6-7.2c0.1-6.6,3.3-13.9,9.7-16.8c4-1.8,9.4-2.4,13.7-2.7     c2.8-0.2,5.7-0.4,8.5-0.4c0.9,0,1.8,0.1,2.7,0.2c7.3,0.6,16.1,0.6,22.4,4.8c1.1,0.8,2.2,1.6,3.2,2.7     C241.8,176.5,241.5,184.1,240.5,190.7"/></g></g><g class="st9"><g><defs><rect height="56.3" id="SVGID_3_" width="64.2" x="269.8" y="163.5"/></defs><clipPath id="SVGID_4_"><use style="overflow:visible;" xlink:href="#SVGID_3_"/></clipPath><path class="st11" d="M333.4,190.7c-2,14.1-5.4,21.5-14.5,25.7c-9.1,4.2-16.8,3.5-16.8,3.5s-7.9,0.7-17-3.5     c-9.1-4.2-12.7-11.6-14.7-25.7c-0.9-6.6-1.3-14.2,3.5-19.4c1-1.1,2-1.9,3.2-2.7c6.3-4.2,15.1-4.2,22.4-4.8     c0.9-0.1,1.8-0.2,2.6-0.2c2.8,0,5.7,0.2,8.5,0.4c4.3,0.3,9.8,0.9,13.7,2.7c6.3,2.9,9.6,10.2,9.7,16.8     C334,185.8,333.8,188.3,333.4,190.7"/></g></g><g><polygon class="st12" points="213.3,299.4 209.3,313.6 219.8,389.7 255.9,352.4   "/><polygon class="st12" points="298.5,299.7 301.9,313.4 292.1,390.5 255.9,352.4   "/></g><g class="st13"><g><defs><rect height="0.5" id="SVGID_5_" width="16.3" x="247.8" y="388.8"/></defs><clipPath id="SVGID_6_"><use style="overflow:visible;" xlink:href="#SVGID_5_"/></clipPath><polygon class="st14" points="247.9,388.8 264.1,388.8 264.1,389.3 247.9,389.3    "/></g></g><g><path class="st15" d="M213.4,177.2c5.9,0,10.7,5.4,10.7,12.1c0,6.7-4.8,12.1-10.7,12.1c-5.9,0-10.7-5.4-10.7-12.1    C202.8,182.6,207.6,177.2,213.4,177.2"/><path class="st15" d="M300,177.2c5.9,0,10.7,5.4,10.7,12.1c0,6.7-4.8,12.1-10.7,12.1c-5.9,0-10.7-5.4-10.7-12.1    C289.4,182.6,294.1,177.2,300,177.2"/><path class="st16" d="M234.7,253.7c3.8,8.4,12.2,14.2,22,14.2c9.8,0,18.2-5.8,22-14.2H234.7z"/></g><polygon class="st17" points="256,488.5 256,488.5 256,488.5  "/><path class="st18" d="M142.9,456.5c0.7,0.4,1.4,0.8,2,1.2c0-10.4,0-16.7,0-16.7S144.1,446.9,142.9,456.5z"/><path class="st18" d="M366.9,457.9c0.7-0.4,1.4-0.8,2.1-1.3c-1.2-9.6-2-15.5-2-15.5S366.9,447.4,366.9,457.9z"/><path d="M264.1,388.8l10.8-16.4l-18.9-20l-19.3,20l11.3,16.4l-14.1,98.6c7.3,0.7,14.7,1.1,22.2,1.1h0c7.5,0,14.9-0.4,22.2-1.1   L264.1,388.8z"/></g></svg>
""".trimIndent()

val SVGHomeRecords = """
    <svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 504 504" style="enable-background:new 0 0 504 504;" xml:space="preserve"> <circle style="fill:#FD8469;" cx="252" cy="252" r="252"/> <rect x="94.5" y="104.3" style="fill:#324A5E;" width="315" height="295.3"/> <g> <rect x="122.1" y="170.6" style="fill:#FFFFFF;" width="259.9" height="201.5"/> <rect x="122.1" y="127.9" style="fill:#FFFFFF;" width="32.5" height="19.2"/> </g> <rect x="175.7" y="127.9" style="fill:#F9B54C;" width="32.5" height="19.2"/> <rect x="229.4" y="127.9" style="fill:#54C0EB;" width="32.5" height="19.2"/> <path style="fill:#F1543F;" d="M268.6,304.9v-26.5h-13.2c-1.2-4.5-3-8.8-5.3-12.8l9.3-9.3l-18.8-18.8l-9.3,9.3 c-4-2.3-8.2-4.1-12.8-5.3v-13.2H192v13.2c-4.5,1.2-8.8,3-12.8,5.3l-9.3-9.3l-18.8,18.8l9.3,9.3c-2.3,4-4.1,8.2-5.3,12.8h-13.2v26.5 h13.2c1.2,4.5,3,8.8,5.3,12.8l-9.3,9.3l18.8,18.8l9.3-9.3c4,2.3,8.2,4.1,12.8,5.3V355h26.5v-13.2c4.5-1.2,8.8-3,12.8-5.3l9.3,9.3 l18.8-18.8l-9.3-9.3c2.3-4,4.1-8.2,5.3-12.8L268.6,304.9L268.6,304.9z M205.3,326.3c-19.1,0-34.6-15.5-34.6-34.6 s15.5-34.6,34.6-34.6s34.6,15.5,34.6,34.6C239.8,310.8,224.4,326.3,205.3,326.3z"/> <path style="fill:#FFD05B;" d="M356.3,244.9v-17.8h-8.9c-0.8-3-2-5.9-3.6-8.6l6.3-6.3l-12.6-12.6l-6.3,6.3c-2.7-1.5-5.5-2.7-8.6-3.6 v-8.9h-17.8v8.9c-3,0.8-5.9,2-8.6,3.6l-6.3-6.3l-12.6,12.6l6.3,6.3c-1.5,2.7-2.7,5.5-3.6,8.6h-8.9v17.8h8.9c0.8,3,2,5.9,3.6,8.6 l-6.3,6.3l12.6,12.6l6.3-6.3c2.7,1.5,5.5,2.7,8.6,3.6v8.9h17.8v-8.9c3-0.8,5.9-2,8.6-3.6l6.3,6.3l12.6-12.6l-6.3-6.3 c1.5-2.7,2.7-5.5,3.6-8.6H356.3z M313.7,259.3c-12.8,0-23.3-10.4-23.3-23.3s10.4-23.3,23.3-23.3S337,223.2,337,236 S326.5,259.3,313.7,259.3z"/> </svg>
"""

val SVGHomePeriod = """ 
    <svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 504 504" style="enable-background:new 0 0 504 504;" xml:space="preserve"> <circle style="fill:#FFD05B;" cx="252" cy="252" r="252"/> <rect x="94.5" y="94.5" style="fill:#324A5E;" width="315" height="315"/> <g> <rect x="122.1" y="168.6" style="fill:#FFFFFF;" width="259.9" height="213.3"/> <rect x="122.1" y="121.9" style="fill:#FFFFFF;" width="32.5" height="19.2"/> </g> <rect x="175.7" y="121.9" style="fill:#F9B54C;" width="32.5" height="19.2"/> <rect x="229.4" y="121.9" style="fill:#54C0EB;" width="32.5" height="19.2"/> <rect x="144.1" y="188.1" style="fill:#F1543F;" width="37.4" height="23.6"/> <rect x="204.1" y="188.1" style="fill:#FF7058;" width="155.8" height="23.6"/> <rect x="322.5" y="238.4" style="fill:#84DBFF;" width="37.4" height="23.6"/> <rect x="144.1" y="238.4" style="fill:#54C0EB;" width="155.8" height="23.6"/> <rect x="144.1" y="288.6" style="fill:#FFD05B;" width="37.4" height="23.6"/> <rect x="204.1" y="288.6" style="fill:#F9B54C;" width="155.8" height="23.6"/> <rect x="322.5" y="338.8" style="fill:#4CDBC4;" width="37.4" height="23.6"/> <rect x="144.1" y="338.8" style="fill:#2C9984;" width="155.8" height="23.6"/> </svg>
"""

val SVGHomeSoftware = """
    <svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 504 504" style="enable-background:new 0 0 504 504;" xml:space="preserve"> <circle style="fill:#324A5E;" cx="252" cy="252" r="252"/> <polygon style="fill:#FFFFFF;" points="354.4,94.5 236.6,94.5 236.6,305.7 409.5,305.7 409.5,149.6 "/> <polygon style="fill:#ACB3BA;" points="354.4,149.6 409.5,149.6 354.4,94.5 "/> <rect x="259.5" y="119.2" style="fill:#324A5E;" width="71.9" height="7.9"/> <rect x="259.5" y="141.7" style="fill:#ACB3BA;" width="71.9" height="7.9"/> <rect x="259" y="175" style="fill:#FF7058;" width="128" height="25.9"/> <rect x="259" y="216.9" style="fill:#F9B54C;" width="37.6" height="25.9"/> <rect x="304.2" y="216.9" style="fill:#2C9984;" width="37.6" height="25.9"/> <rect x="349.4" y="216.9" style="fill:#ACB3BA;" width="37" height="25.9"/> <rect x="259" y="258.8" style="fill:#54C0EB;" width="64" height="25.9"/> <rect x="331.3" y="261.5" style="fill:#ACB3BA;" width="55.1" height="6.1"/> <rect x="331.3" y="276" style="fill:#4CDBC4;" width="55.1" height="6.1"/> <path style="fill:#FFFFFF;" d="M307.9,409.5H96.1c-0.9,0-1.6-0.7-1.6-1.6V320c0-0.9,0.7-1.6,1.6-1.6h211.8c0.9,0,1.6,0.7,1.6,1.6 v87.9C309.4,408.8,308.7,409.5,307.9,409.5z"/> <g> <rect x="105.6" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="134.7" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="163.8" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="192.9" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="222" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="251.1" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="280.2" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> </g> <g> <rect x="105.6" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="130.7" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="155.7" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="180.8" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="205.9" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="230.9" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="256" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="281.1" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="105.6" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="130.7" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="155.7" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="180.8" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="205.9" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="230.9" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="256" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="281.1" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> </g> <rect x="105.6" y="387.4" style="fill:#2C9984;" width="17.3" height="14.4"/> <rect x="130.7" y="387.4" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="155.7" y="387.4" style="fill:#FF7058;" width="92.5" height="14.4"/> <rect x="256" y="387.4" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="281.1" y="387.4" style="fill:#324A5E;" width="17.3" height="14.4"/> <path style="fill:#FFFFFF;" d="M207.9,318.5h-11.8v-12c0-5.7-4.6-10.3-10.3-10.3h-43.7c-13.9,0-25.1-11.3-25.1-25.1 c0-13.9,11.3-25.1,25.1-25.1h56.2c5.7,0,10.3-4.6,10.3-10.3s-4.6-10.3-10.3-10.3h-53.4c-14.9,0-27.1-12.1-27.1-27.1 s12.1-27.1,27.1-27.1h91.7V183h-91.7c-8.4,0-15.3,6.8-15.3,15.3s6.8,15.3,15.3,15.3h53.4c12.2,0,22.1,9.9,22.1,22.1 s-9.9,22.1-22.1,22.1h-56.2c-7.3,0-13.3,6-13.3,13.3s6,13.3,13.3,13.3h43.7c12.2,0,22.1,9.9,22.1,22.1V318.5z"/> </svg>
"""

// 2 gears in yellow folder
val SVGDictionaryIcon = """
    <svg version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 512 512" style="enable-background:new 0 0 512 512;" xml:space="preserve"> <circle style="fill:#ffffff;" cx="256" cy="256" r="256"/> <path style="fill:#FAD24D;" d="M45.986,144.06h420.022c12.052,0,21.91,9.858,21.91,21.91v261.754H24.072V165.97 C24.072,153.917,33.93,144.06,45.986,144.06z"/> <path style="fill:#EDB937;" d="M177.274,105.405H441.34c12.052,0,21.915,9.858,21.915,21.915v16.739H48.75V127.32V91.068 c0-3.735,3.057-6.797,6.797-6.797h114.936c3.74,0,6.797,3.062,6.797,6.797v14.337H177.274z"/> <path style="fill:#FEFEFE;" d="M78.404,125.334h380.453c8.033,0,14.611,6.573,14.611,14.611v5.431 c-2.331-0.853-4.844-1.317-7.459-1.317H63.792v-4.114C63.792,131.907,70.367,125.334,78.404,125.334z"/> <path style="fill:#EDB937;" d="M487.924,418.008v9.716H24.076v-9.716H487.924z"/> 
        <path style="fill:#676f32;" d="M300.2,295.963l5.233-19.939l-11.839-4.645c0.398-4.469,0.374-8.971-0.071-13.441l11.792-4.768 l-5.441-19.886l-12.559,1.895c-1.867-4.033-4.133-7.92-6.797-11.611l7.825-10.019l-14.654-14.503l-9.939,7.93 c-3.721-2.621-7.631-4.849-11.678-6.673l1.763-12.583l-19.939-5.233l-4.645,11.839c-4.469-0.398-8.971-0.379-13.441,0.071 l-4.768-11.792l-20.098,5.44l1.681,12.56v0.019c-3.992,1.867-7.704,4.133-11.396,6.797l-9.912-7.83l-14.449,14.654l7.956,9.939 c-2.621,3.721-4.835,7.63-6.66,11.678l-12.576-1.768l-5.229,19.939l11.841,4.645c-0.398,4.469-0.373,8.971,0.072,13.441 l-11.791,4.768l5.441,19.882l12.559-1.895c1.867,4.028,4.133,7.915,6.797,11.607l-7.825,10.019l14.654,14.503l9.939-7.93 c3.716,2.621,7.63,4.849,11.678,6.673l-1.763,12.583l19.939,5.233l4.645-11.839c4.469,0.398,8.971,0.374,13.441-0.071l4.768,11.792 l19.882-5.44l-1.895-12.559c4.028-1.867,7.92-4.133,11.611-6.797l10.019,7.825l14.503-14.654l-7.93-9.939 c2.621-3.716,4.849-7.63,6.673-11.678L300.2,295.963z M245.991,287.878c-12.626,12.754-33.2,12.863-45.953,0.237 c-12.754-12.621-12.863-33.195-0.237-45.953c12.625-12.754,33.199-12.863,45.953-0.237 C258.507,254.55,258.616,275.124,245.991,287.878z"/> <path style="fill:#fd8469;" d="M222.895,223.056c-23.171,0-41.958,18.782-41.958,41.958c0,23.171,18.782,41.958,41.958,41.958 c23.171,0,41.958-18.782,41.958-41.958C264.854,241.844,246.071,223.056,222.895,223.056z M245.991,287.878 c-12.626,12.754-33.2,12.863-45.953,0.237c-12.754-12.625-12.858-33.2-0.237-45.953c12.625-12.754,33.199-12.863,45.953-0.237 C258.507,254.55,258.616,275.124,245.991,287.878z"/> 
        <path style="fill:324a5e;" d="M364.571,342.737c0.128-2.355,0.01-4.74-0.369-7.119l6.816-3.881l-7.744-16.1l-7.347,2.635 c-1.607-1.792-3.388-3.384-5.299-4.768l2.076-7.564l-16.858-5.91l-3.332,7.057c-2.358-0.128-4.741-0.009-7.114,0.369l-3.881-6.815 l-16.1,7.744l2.635,7.342c-1.792,1.607-3.384,3.388-4.768,5.299l-7.564-2.076l-5.91,16.863l7.057,3.332 c-0.128,2.355-0.009,4.74,0.369,7.114l-6.816,3.886l7.744,16.1l7.342-2.635c1.607,1.792,3.384,3.388,5.294,4.773l-2.071,7.564 l16.863,5.91l3.332-7.062c2.355,0.128,4.744,0.01,7.118-0.369l3.881,6.816l16.1-7.744l-2.635-7.342 c1.792-1.607,3.384-3.384,4.768-5.299l7.564,2.076l5.91-16.863L364.571,342.737z M343.342,353.438 c-6.901,6.971-18.009,7.033-24.98,0.128c-6.971-6.901-6.97-18.152,0.016-25.124v0.005c6.986-6.971,18.009-7.033,24.98-0.133 S350.248,346.466,343.342,353.438z"/> 
        <path style="fill:#ECF0F1;" d="M330.717,315.637c-13.977,0-25.309,11.327-25.309,25.304c0,13.972,11.332,25.304,25.309,25.304 c13.972,0,25.304-11.327,25.304-25.304C356.021,326.963,344.694,315.637,330.717,315.637z M343.342,353.438 c-6.901,6.971-18.006,7.033-24.978,0.128c-6.976-6.901-6.973-18.152,0.013-25.124v0.005c6.986-6.976,18.006-7.033,24.982-0.133 C350.333,335.214,350.248,346.466,343.342,353.438z"/> 
    </svg>
""".trimIndent()

// Cloud
val SVGCloudForDict = """
    <svg xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" version="1.1" id="cloudstorage" x="0px" y="0px" viewBox="0 0 233.8379 219.8237" enable-background="new 0 0 233.8379 219.8237" xml:space="preserve"> <g> <path fill="#5CB0FF" d="M194.3613,55.1465l-2.707-1.0996l0.2246-2.9141C191.959,50.0996,192,49.0547,192,48   c0-22.0566-17.9434-40-40-40c-14.9785,0-28.584,8.2598-35.5039,21.5586l-1.5117,2.9023l-3.1445-0.9062   c-4.248-1.2246-8.668-1.8457-13.1328-1.8457c-23.2402,0-43.2402,17.1973-46.5215,40.0039l-0.498,3.4688l-3.9766-0.043   C25.8145,73.1387,8,90.8281,8,112.5703S25.8145,152,47.7109,152h127.4883c27.9219,0,50.6387-22.5586,50.6387-50.2871   C225.8379,81.1953,213.4824,62.916,194.3613,55.1465z M120,124h-16v-8h16V124z M136,88h16v8h-16V88z M124,100h16v8h-16V100z    M144,140h-16v-8h16V140z M144,104h16v8h-16V104z M164,148h-16v-8h16V148z M164,84h16v8h-16V84z M184,144h-16v-8h16V144z M194,124   h-16v-8h16V124z"/> <path fill="#1C71DA" d="M199.9922,48.873C199.998,48.582,200,48.291,200,48c0-26.4668-21.5332-48-48-48   c-16.9004,0-32.3438,8.7637-41.0312,23.0742c-4.0059-0.9062-8.1172-1.3652-12.2617-1.3652   c-26.043,0-48.6113,18.4805-53.8496,43.5137C19.873,66.6934,0,87.3672,0,112.5703C0,138.7227,21.4023,160,47.7109,160h127.4883   c32.334,0,58.6387-26.1484,58.6387-58.2871C233.8379,78.875,220.6465,58.4336,199.9922,48.873z M175.1992,152H47.7109   C25.8145,152,8,134.3125,8,112.5703s17.8145-39.4316,39.7109-39.4316l3.9766,0.043l0.498-3.4688   C55.4668,46.9062,75.4668,29.709,98.707,29.709c4.4648,0,8.8848,0.6211,13.1328,1.8457l3.1445,0.9062l1.5117-2.9023   C123.416,16.2598,137.0215,8,152,8c22.0566,0,40,17.9434,40,40c0,1.0547-0.041,2.0996-0.1211,3.1328l-0.2246,2.9141l2.707,1.0996   c19.1211,7.7695,31.4766,26.0488,31.4766,46.5664C225.8379,129.4414,203.1211,152,175.1992,152z"/> <rect x="112" y="164" fill="#1C71DA" width="16" height="8"/> <rect x="168" y="136" fill="#FFFFFF" width="16" height="8"/> <rect x="136" y="88" fill="#FFFFFF" width="16" height="8"/> <rect x="144" y="104" fill="#FFFFFF" width="16" height="8"/> <rect x="120" y="176" fill="#1C71DA" width="16" height="8"/> <rect x="72" y="172" fill="#1C71DA" width="16" height="8"/> <rect x="178" y="116" fill="#FFFFFF" width="16" height="8"/> <rect x="144" y="184" fill="#1C71DA" width="16" height="8"/> <rect x="132" y="200" fill="#1C71DA" width="16" height="8"/> <rect x="84" y="184" fill="#1C71DA" width="16" height="8"/> <rect x="140" y="168" fill="#1C71DA" width="16" height="8"/> <rect x="148" y="140" fill="#FFFFFF" width="16" height="8"/> <rect x="128" y="132" fill="#FFFFFF" width="16" height="8"/> <rect x="104" y="116" fill="#FFFFFF" width="16" height="8"/> <rect x="124" y="100" fill="#FFFFFF" width="16" height="8"/> <rect x="164" y="84" fill="#FFFFFF" width="16" height="8"/> </g> <path fill="#FF5D5D" d="M16.2524,35.8237c-1.0239,0-2.0474-0.3906-2.8286-1.1714c-1.562-1.5625-1.562-4.0947,0-5.6572  L27.5659,14.853c1.5625-1.5615,4.0947-1.5615,5.6572,0c1.562,1.5625,1.562,4.0947,0,5.6572L19.0811,34.6523  C18.2998,35.4331,17.2764,35.8237,16.2524,35.8237z"/> <path fill="#FF5D5D" d="M30.3945,35.8223c-1.0239,0-2.0474-0.3906-2.8286-1.1714L13.4238,20.5083  c-1.562-1.5625-1.562-4.0952,0-5.6572c1.563-1.5615,4.0952-1.561,5.6572,0l14.1421,14.1426c1.562,1.5625,1.562,4.0952,0,5.6572  C32.4419,35.4316,31.418,35.8223,30.3945,35.8223z"/> <path fill="#00D40B" d="M34.2524,219.8237c-7.7197,0-14-6.2803-14-14s6.2803-14,14-14s14,6.2803,14,14  S41.9722,219.8237,34.2524,219.8237z M34.2524,199.8237c-3.3086,0-6,2.6914-6,6s2.6914,6,6,6s6-2.6914,6-6  S37.561,199.8237,34.2524,199.8237z"/> <path fill="#FFC504" d="M215.5659,34.4492c-1.0239,0-2.0474-0.3906-2.8286-1.1714l-11.3135-11.3135  c-1.562-1.5625-1.562-4.0947,0-5.6572l11.3135-11.3135c1.5625-1.5615,4.0952-1.5615,5.6567,0l11.314,11.3135  c0.7505,0.7505,1.1719,1.7676,1.1719,2.8286s-0.4214,2.0781-1.1719,2.8286l-11.314,11.3135  C217.6133,34.0586,216.5894,34.4492,215.5659,34.4492z M209.9092,19.1357l5.6567,5.6567l5.6572-5.6567l-5.6572-5.6567  L209.9092,19.1357z"/> </svg>
""".trimIndent()

// PC with keyboard
val SVGSWforDict = """
    <svg  version="1.1" id="Layer_1" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 504 504" style="enable-background:new 0 0 504 504;" xml:space="preserve"> <circle style="fill:#324A5E;" cx="252" cy="252" r="252"/> <polygon style="fill:#FFFFFF;" points="354.4,94.5 236.6,94.5 236.6,305.7 409.5,305.7 409.5,149.6 "/> <polygon style="fill:#ACB3BA;" points="354.4,149.6 409.5,149.6 354.4,94.5 "/> <rect x="259.5" y="119.2" style="fill:#324A5E;" width="71.9" height="7.9"/> <rect x="259.5" y="141.7" style="fill:#ACB3BA;" width="71.9" height="7.9"/> <rect x="259" y="175" style="fill:#FF7058;" width="128" height="25.9"/> <rect x="259" y="216.9" style="fill:#F9B54C;" width="37.6" height="25.9"/> <rect x="304.2" y="216.9" style="fill:#2C9984;" width="37.6" height="25.9"/> <rect x="349.4" y="216.9" style="fill:#ACB3BA;" width="37" height="25.9"/> <rect x="259" y="258.8" style="fill:#54C0EB;" width="64" height="25.9"/> <rect x="331.3" y="261.5" style="fill:#ACB3BA;" width="55.1" height="6.1"/> <rect x="331.3" y="276" style="fill:#4CDBC4;" width="55.1" height="6.1"/> <path style="fill:#FFFFFF;" d="M307.9,409.5H96.1c-0.9,0-1.6-0.7-1.6-1.6V320c0-0.9,0.7-1.6,1.6-1.6h211.8c0.9,0,1.6,0.7,1.6,1.6 v87.9C309.4,408.8,308.7,409.5,307.9,409.5z"/> <g> <rect x="105.6" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="134.7" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="163.8" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="192.9" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="222" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="251.1" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> <rect x="280.2" y="326.3" style="fill:#ACB3BA;" width="18.1" height="9.8"/> </g> <g> <rect x="105.6" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="130.7" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="155.7" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="180.8" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="205.9" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="230.9" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="256" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="281.1" y="342.8" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="105.6" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="130.7" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="155.7" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="180.8" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="205.9" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="230.9" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="256" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="281.1" y="365.1" style="fill:#CED5E0;" width="17.3" height="14.4"/> </g> <rect x="105.6" y="387.4" style="fill:#2C9984;" width="17.3" height="14.4"/> <rect x="130.7" y="387.4" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="155.7" y="387.4" style="fill:#FF7058;" width="92.5" height="14.4"/> <rect x="256" y="387.4" style="fill:#CED5E0;" width="17.3" height="14.4"/> <rect x="281.1" y="387.4" style="fill:#324A5E;" width="17.3" height="14.4"/> <path style="fill:#FFFFFF;" d="M207.9,318.5h-11.8v-12c0-5.7-4.6-10.3-10.3-10.3h-43.7c-13.9,0-25.1-11.3-25.1-25.1 c0-13.9,11.3-25.1,25.1-25.1h56.2c5.7,0,10.3-4.6,10.3-10.3s-4.6-10.3-10.3-10.3h-53.4c-14.9,0-27.1-12.1-27.1-27.1 s12.1-27.1,27.1-27.1h91.7V183h-91.7c-8.4,0-15.3,6.8-15.3,15.3s6.8,15.3,15.3,15.3h53.4c12.2,0,22.1,9.9,22.1,22.1 s-9.9,22.1-22.1,22.1h-56.2c-7.3,0-13.3,6-13.3,13.3s6,13.3,13.3,13.3h43.7c12.2,0,22.1,9.9,22.1,22.1V318.5z"/> </svg>
""".trimIndent()

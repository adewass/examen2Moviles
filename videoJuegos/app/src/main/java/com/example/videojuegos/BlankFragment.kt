package com.example.videojuegos
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment


class BlankFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)
        val webView1: WebView = view.findViewById(R.id.game1_webview)
        val webView2: WebView = view.findViewById(R.id.game2_webview)
        val webView3: WebView = view.findViewById(R.id.game3_webview)
        val webView4: WebView = view.findViewById(R.id.game4_webview)
        val webView5: WebView = view.findViewById(R.id.game5_webview)
        val webView6: WebView = view.findViewById(R.id.game6_webview)
        val webView7: WebView = view.findViewById(R.id.game7_webview)
        val webView8: WebView = view.findViewById(R.id.game8_webview)

        // Cargar el primer video de YouTube usando un iframe
        val videoId1 = "ZWb6wCKA_Pk"
        val html1 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId1\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView1.settings.javaScriptEnabled = true
        webView1.loadData(html1, "text/html", "utf-8")

        // Cargar el segundo video de YouTube usando un iframe
        val videoId2 = "ASzOzrB-a9E" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html2 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId2\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView2.settings.javaScriptEnabled = true
        webView2.loadData(html2, "text/html", "utf-8")

        val videoId3 = "qLZenOn7WUo" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html3 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId3\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView3.settings.javaScriptEnabled = true
        webView3.loadData(html3, "text/html", "utf-8")

        val videoId4 = "1T22wNvoNiU" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html4 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId4\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView4.settings.javaScriptEnabled = true
        webView4.loadData(html4, "text/html", "utf-8")

        val videoId5 = "uKA-IA4locM" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html5 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId5\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView5.settings.javaScriptEnabled = true
        webView5.loadData(html5, "text/html", "utf-8")

        val videoId6 = "mIridrRzU3w" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html6 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId6\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView6.settings.javaScriptEnabled = true
        webView6.loadData(html6, "text/html", "utf-8")

        val videoId7 = "ot7uXNQskhs" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html7 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId7\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView7.settings.javaScriptEnabled = true
        webView7.loadData(html7, "text/html", "utf-8")

        val videoId8 = "h1qH1agrvZ0" // Reemplaza VIDEO_ID_AQUI con el ID del segundo video de YouTube
        val html8 = "<html><body style=\"margin:0;padding:0;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId8\" frameborder=\"0\" allowfullscreen></iframe></body></html>"
        webView8.settings.javaScriptEnabled = true
        webView8.loadData(html8, "text/html", "utf-8")


        return view
    }
}








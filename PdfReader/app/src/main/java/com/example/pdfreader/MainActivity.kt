package com.example.pdfreader

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.SoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import com.example.pdfreader.ui.theme.PdfReaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PdfReaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun PdfViewer(filePath: String) {
    val document = MuPDFAssetDocument.openAsset(context, filePath)
    val pageController = remember { PageController(document) }

    Column {
        LazyColumn(
            modifier = Modifer.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(pageController.pageCount) { page ->
                Pdfpage(pageController, page)
            }

        }

        Controls(pageController)
    }
}

@Composable
fun Pdfpage(pageController: PageController, page: Int) {
    val pageAsset = pageController.getDocumentPageAsset(page)
    if (pageAsset != null) {
        BitmapRenderBox(
            modifier = Modifier.fillMaxSize(),
            bitmap = pageAsset.renderToBitmap(context)
        )
    } else {
        Text("Siden kunne ikke indlæses")
    }
}


package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.fillMaxHeight()
            .padding(8.dp)
    ){
        CompanyInfo(
            company = "College of Staten Island"
        )
        Spacer(modifier = Modifier.height(35.dp))
        PersonInfo(
            name = "Andrew Thomas",
            position = "Software Engineer",
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        Spacer(modifier = Modifier.height(35.dp))
        ContactInfo(
            location = "Staten Island, NY",
            email = "andrewvt97@gmail.com",
            website = "andrewvt97.github.io",
            linkedin = "linkedin.com/in/andrewvt97")
    }
}

@Composable
fun CompanyInfo(company:String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.csi_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(8.dp)
    ) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        )
        Text(
            text = company,
            fontSize = 30.sp,
            lineHeight = 30.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun PersonInfo(name: String, position: String, modifier: Modifier = Modifier){
    val lightBlue = Color(0xFF58B9F3)
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {

        Text(
            text = name,
            fontSize = 50.sp,
            lineHeight = 70.sp,
            color = lightBlue,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Black,
        )

        Text(
            text = position,
            fontSize = 30.sp,
            lineHeight = 45.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun ContactInfo(location: String, email: String, website: String, linkedin: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ){
        Text(
            text = location,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = email,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = website,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )

        Text(
            text = linkedin,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            color = Color.Black,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCardScreen()
    }
}
package com.example.MyUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uipertama.R

@Composable
fun AktivitasPertama(modifier: Modifier) {
    Column (
        modifier = Modifier
            .padding(top = 50.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = 22.sp
            )

            Spacer(modifier = Modifier.height(25.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth(fraction = 1f)
                    .padding(all = 12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black
                )
            ) {
                Row {
                    val gambar = painterResource(id = R.drawable.logo_umy)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(all = 5.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.nama),
                            fontSize = 30.sp,
                            fontFamily = FontFamily.Cursive,
                            color = Color.White,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.alamat),
                            fontSize = 20.sp,
                            color = Color.White,
                            modifier = Modifier.padding(top = 15.dp)

                        )
                        Text(
                            text = stringResource(id = R.string.nomor).trim(),
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Normal,
                            modifier = Modifier
                                .padding(bottom = 15.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 7.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray
                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) { Row {
                    val gambar = painterResource(id = R.drawable.logo_umy)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(100.dp)
                            .padding(all = 5.dp)
                    )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama2),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat2),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(bottom = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nomor2).trim(),
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                    )
                }
            }
            }
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp, vertical = 7.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF000080)

                ),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ){Row {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = stringResource(id = R.string.nama3),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.SansSerif,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.alamat3),
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(bottom = 15.dp)
                    )
                    Text(
                        text = stringResource(id = R.string.nomor3).trim(),
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier
                            .padding(bottom = 15.dp)
                    )
                }
            }
            }
            Box(
                modifier = Modifier.fillMaxSize()
            ){
                Text(
                    text = stringResource(id = R.string.copy),
                    modifier = Modifier
                        .align (Alignment.BottomCenter)
                        .padding(bottom = 50.dp)
                )
            }
        }
    }
}




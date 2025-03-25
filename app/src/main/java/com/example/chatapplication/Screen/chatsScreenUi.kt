package com.example.chatapplication.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chatapplication.R

@Preview(showBackground = true, showSystemUi = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatsScreenUi(modifier: Modifier = Modifier) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {  },
                shape = RoundedCornerShape(50.dp),
                containerColor = colorScheme.inversePrimary
            ) {
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null
                )
            }
        }
    ){
        it

        Column(
            modifier = Modifier.padding(top = 36.dp)
        ) {
            Box() {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier.fillMaxWidth(0.98f)
                ) {
                    Column {
                        Text(
                            text = "Hello, ",
                            modifier = Modifier
                                .padding(start = 16.dp)
                                .offset(y = 5.dp),
                            style = MaterialTheme.typography.titleSmall
                        )
                        Text(
                            text = "username",
                            modifier = Modifier.padding(start = 16.dp),
                            style = MaterialTheme.typography.titleSmall.copy(fontSize = 20.sp)
                        )

                    }
                    Spacer(modifier = Modifier.weight(1f))
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .background(
                                colorScheme.background.copy(alpha = 0.2f),

                            )
                            .border(
                                0.05.dp,
                                color = Color(0xFF35567A),

                            )
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable._666693_search_icon),
                            contentDescription = null,
                            modifier = Modifier.scale(0.7f)
                        )

                    }

                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .background(
                                colorScheme.background.copy(alpha = .2f),

                            )
                            .border(0.05.dp, Color(0xFF35567A))
                    ) {
                        Icon(
                            imageVector = Icons.Filled.MoreVert,
                            contentDescription = null,
                            modifier = Modifier.scale(1.3f)
                        )
                    }

                }
            }
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = colorScheme.background.copy(alpha = .2f),
                        shape = RoundedCornerShape(30.dp, 30.dp)
                    )
                    .border(
                        0.05.dp,
                        color = Color(0xFF35567A),
                        shape = RoundedCornerShape(30.dp, 30.dp),


                        )
            ) {
                item {
                    Text(
                        text = "Chats",
                        modifier = Modifier

                            .fillMaxWidth(),
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Normal
                    )
                }

            }
        }
    }
}
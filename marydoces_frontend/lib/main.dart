import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:marydoces/screens/homeScreen.dart';



void main()=>runApp( MariDoces());

class MariDoces extends StatelessWidget{

  @override
  Widget build(BuildContext context) {
    
    return MaterialApp(
      title: "Maridoces",
      theme: ThemeData(
        primarySwatch: Colors.blue,
        primaryColor: Color.fromARGB(255, 250, 226, 178)  
      ),
      debugShowCheckedModeBanner: false,
      home: HomeScreen()
      );
  }

  
}
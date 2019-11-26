import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

class HomeTab extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    
    Widget _bildBodyBack()=>Container(
      decoration: BoxDecoration(
        color:Color.fromARGB(255, 250, 226, 178)
      ),
    );

    return Stack(
      children: <Widget>[
        _bildBodyBack(),
        CustomScrollView(
          slivers: <Widget>[
            SliverAppBar( 
              floating: true,
              snap: true,
              backgroundColor: Colors.transparent,
              elevation: 0.0,
              flexibleSpace: FlexibleSpaceBar(
                title: const Text("MariDoces"),
                centerTitle: true,
              ),
            )
          ],
        )
      ],
    );
  }
  
}
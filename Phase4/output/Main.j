.class public Main
.super java/lang/Object
.method public static main([Ljava/lang/String;)V
.limit stack 128
.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
.end method
.method public <init>()V
.limit stack 128
.limit locals 128
		aload 0
		invokespecial java/lang/Object/<init>()V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 1
		
		new Fptr
		dup
		aload 0
		ldc "f"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 1
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Boolean
		invokevirtual java/lang/Boolean/booleanValue()Z
		invokevirtual java/io/PrintStream/println(Z)V
		return
.end method
		 
.method public f()Ljava/lang/Boolean;
.limit stack 128
.limit locals 128
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		new List
		dup
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		invokespecial List/<init>(Ljava/util/ArrayList;)V
		astore 7
		aload 7
		astore 4
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 5
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 7
		aload 7
		ldc 9
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 2
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 7
		ldc 3
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 7
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 8
		aload 8
		ldc 7
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 8
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 8
		ldc 11
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 9
		
		new Fptr
		dup
		aload 0
		ldc "h"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 9
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast Fptr
		aload 8
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 9
		aload 9
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 9
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 9
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 10
		
		new Fptr
		dup
		aload 0
		ldc "h"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 10
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast Fptr
		aload 9
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 10
		aload 10
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "c1"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 10
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 11
		aload 11
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "c2"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 11
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 12
		aload 12
		ldc 1
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "c3"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 12
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		pop
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 13
		aload 13
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 14
		aload 14
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 14
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 14
		ldc 5
		ldc 3
		if_icmple Label_0
		ldc 1
		goto Label_1
		Label_0:
		ldc 0
		Label_1:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 14
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "selector"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 14
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast Fptr
		aload 13
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 14
		aload 14
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 15
		aload 15
		ldc 3
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 15
		ldc 5
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 15
		ldc 3
		ldc 5
		if_icmple Label_2
		ldc 1
		goto Label_3
		Label_2:
		ldc 0
		Label_3:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 15
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "selector"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 15
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast Fptr
		aload 14
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		getstatic java/lang/System/out Ljava/io/PrintStream;
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 15
		aload 15
		ldc 10
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 16
		aload 16
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		ldc 2
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		ldc 2
		ldc 2
		if_icmple Label_4
		ldc 1
		goto Label_5
		Label_4:
		ldc 0
		Label_5:
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "selector"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 16
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast Fptr
		aload 15
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
	Label_6:
		aload 5
		invokevirtual java/lang/Integer/intValue()I
		ldc 8
		if_icmpge Label_8
		ldc 1
		goto Label_9
		Label_8:
		ldc 0
		Label_9:
		ifeq Label_7
		aload 4
		aload 5
		invokevirtual java/lang/Integer/intValue()I
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual List/addElement(Ljava/lang/Object;)V
		aload 5
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		dup
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		astore 5
		pop
		goto Label_6
	Label_7:
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 16
		aload 16
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 16
		aload 4
		pop
		new List
		dup
		aload 4
		invokespecial List/<init>(LList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "x"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 16
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		areturn
.end method
		 
.method public g(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		imul
		aload 3
		invokevirtual java/lang/Integer/intValue()I
		iadd
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		isub
		invokevirtual java/io/PrintStream/println(I)V
		return
		return
.end method
		 
.method public h()LFptr;
.limit stack 128
.limit locals 128
		
		new Fptr
		dup
		aload 0
		ldc "g"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
.end method
		 
.method public c1(Ljava/lang/Integer;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 1
		invokevirtual java/io/PrintStream/println(I)V
		ldc 2
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		imul
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
.end method
		 
.method public c2(Ljava/lang/Integer;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 2
		invokevirtual java/io/PrintStream/println(I)V
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 24
		imul
		ldc 2
		idiv
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
.end method
		 
.method public c3(Ljava/lang/Integer;)Ljava/lang/Integer;
.limit stack 128
.limit locals 128
		getstatic java/lang/System/out Ljava/io/PrintStream;
		ldc 3
		invokevirtual java/io/PrintStream/println(I)V
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1000
		isub
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		areturn
.end method
		 
.method public selector(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;)LFptr;
.limit stack 128
.limit locals 128
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		if_icmple Label_16
		ldc 1
		goto Label_17
		Label_16:
		ldc 0
		Label_17:
		ifeq Label_14
		aload 3
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifeq Label_14
		ldc 1
		goto Label_15
		Label_14:
		ldc 0
		Label_15:
		ifne Label_12
		aload 4
		invokevirtual java/lang/Boolean/booleanValue()Z
		ifne Label_12
		ldc 0
		goto Label_13
		Label_12:
		ldc 1
		Label_13:
		ifeq Label_10
		
		new Fptr
		dup
		aload 0
		ldc "c1"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		goto Label_11
	Label_10:
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		iadd
		aload 2
		invokevirtual java/lang/Integer/intValue()I
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		imul
		if_icmpne Label_20
		ldc 1
		goto Label_21
		Label_20:
		ldc 0
		Label_21:
		ifeq Label_18
		
		new Fptr
		dup
		aload 0
		ldc "c2"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
		goto Label_19
	Label_18:
		
		new Fptr
		dup
		aload 0
		ldc "c3"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
	Label_19:
	Label_11:
		
		new Fptr
		dup
		aload 0
		ldc "c1"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		areturn
.end method
		 
.method public x(Ljava/lang/Integer;LList;)V
.limit stack 128
.limit locals 128
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		aload 2
		invokevirtual List/getSize()I
		
		if_icmpne Label_24
		ldc 1
		goto Label_25
		Label_24:
		ldc 0
		Label_25:
		ifeq Label_22
		return
		goto Label_23
	Label_22:
	Label_23:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 2
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual List/getElement(I)Ljava/lang/Object;
		checkcast java/lang/Integer
		invokevirtual java/lang/Integer/intValue()I
		invokevirtual java/io/PrintStream/println(I)V
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		astore 19
		aload 19
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		aload 19
		aload 2
		pop
		new List
		dup
		aload 2
		invokespecial List/<init>(LList;)V
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		
		new Fptr
		dup
		aload 0
		ldc "x"
		invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V
		aload 19
		invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;
		pop
		return
.end method
		 

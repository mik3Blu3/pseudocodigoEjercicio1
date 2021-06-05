Algoritmo aleatorio_n
	cantidadPar <- 0
	cantidadImpar <- 0
	Escribir 'Ingrese cualquier digito positivo N'
	Leer num
	Escribir ''
	Para i<-1 Hasta num Hacer
		al <- Aleatorio(1,100)
		Escribir 'EL aleatorio #',i,' es: ',al
		Escribir ''
		numeropar <- (al MOD 2)
		Si numeropar==0 Entonces
			Escribir 'El numero: ',al,' es PAR'
			Escribir ''
			cantidadPar <- (cantidadPar+1)
		SiNo
			Escribir 'El numero: ',al,' es IMPAR'
			Escribir ''
			cantidadImpar <- (cantidadImpar+1)
		FinSi
	FinPara
	Escribir 'La cantidad de numeros PARES generados fue: ',cantidadPar
	Escribir ''
	Escribir 'La cantidad de numeros IMPARES generados fue: ',cantidadImpar
FinAlgoritmo

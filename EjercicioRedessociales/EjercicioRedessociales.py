import csv
import string
import re


while True:
    print("          MENU PRINCIPAL          \n\n\n\n\n")
    print("1. Mostrar archivo")
    print("2. Mostrar la diferencia de seguidores en Twitter entre el mes de enero y junio")
    print("3. Calcular la diferencia de visualizaciones de YouTube")
    print("4. Calcular el promedio de crecimiento de Twitter y Facebook entre los meses de enero a junio")
    opc = input("Ingrese una opción")
    if opc=="1":


        nombre_archivo="presenciaredes.csv"
        with open(nombre_archivo, "r") as archivo:
            lector=csv.reader(archivo, delimiter=",")
            next(lector,None)
            for fila in lector:
                redsocial=fila[0]
                concepto=fila[1]
                año=int(fila[2])
                enero=fila[3]
                febreo=fila[4]
                marzo=fila[5]
                abril=fila[6]
                mayo=fila[7]
                junio=fila[8]
                julio=fila[9]
                agosto=fila[10]
                septiembre=fila[11]
                octubre=fila[12]
                noviembre=fila[13]
                diciembre=fila[14]
                print(
                    f"Red social: '{redsocial}' Concepto:'{concepto}' Año:'{año}' Enero:'{enero}' Febrero: '{febreo}' Marzo:'{marzo}' Abril:'{abril}' Mayo:'{mayo}' Junio:'{junio}' Julio:'{julio}' Agosto:'{agosto}' Septiembre:'{septiembre}' Octubre:'{octubre}' Noviembre: '{noviembre}' Diciembre: '{diciembre}'      "
                    )
    if opc=="2":
        nombre_archivo="presenciaredes.csv"
        with open(nombre_archivo, "r") as archivo:
            lector=csv.reader(archivo, delimiter=",")
            next(lector,None)
            diferencia_seguidores=0
            for fila in lector:
                redsocial=fila[0]
                concepto=fila[1]
                año=int(fila[2])
                enero=fila[3]
                enero=re.sub("%","",enero)
                mes1=float(enero)
                febreo=fila[4]
                marzo=fila[5]
                abril=fila[6]
                mayo=fila[7]
                junio=fila[8]
                junio=re.sub("%","",junio)
                mes2=float(junio)

                diferencia_seguidores==mes2[7] - mes1[7]
                print("La diferencia de seguidores en Twitter entre enero y junio es: {diferencia_seguidores}")

    if opc=="4":
        nombre_archivo="presenciaredes.csv"
        with open(nombre_archivo, "r") as archivo:
            lector=csv.reader(archivo, delimiter=",")
            next(lector,None)
            ct=0
            cf=0
            for fila in lector:
                redsocial=fila[0]
                concepto=fila[1]
                año=int(fila[2])
                enero=fila[3]
                febreo=fila[4]
                marzo=fila[5]
                abril=fila[6]
                mayo=fila[7]
                junio=fila[8]

                cf==enero[1] + febreo[1] + marzo[1] + abril[1] + mayo[1] + junio[1]
                cf==cf/6

                ct==enero[8] + febreo[8] + marzo[8] + abril[8] + mayo[8] + junio[8]
                ct==ct/6

                print("Crecimiento de Twitter entre enero y junio: {ct}")
                print("Crecimiento de Facebook entre enero y junio: {cf}")



    
            break


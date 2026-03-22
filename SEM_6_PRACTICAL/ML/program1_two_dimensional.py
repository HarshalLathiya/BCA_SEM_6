import pandas as pd
data = [
    [101,"DHARMIK",80],
    [102,"HARSHAL",90],
    [103,"SUFIYAN",75],
    [104,"ARSHIL",78]
]

df = pd.DataFrame(data,columns=["ID","NAME","MARKS"])

print(df)
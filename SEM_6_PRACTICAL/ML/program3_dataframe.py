import pandas as pd

df = pd.DataFrame({
    "Name": ["DHARMIK","HARSHAL","SUFIYAN","ARSHIL"],
    "Marks": [80,90,75,78]
})

df.columns = ["Student_Name", "Total_Marks"]

df.index = ["A", "B", "C", "D"]

print(df)

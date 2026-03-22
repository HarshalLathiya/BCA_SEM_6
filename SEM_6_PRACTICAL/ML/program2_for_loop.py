import pandas as pd
df = pd.DataFrame({
    "Number":[1,2,3,4,5]
})

square = []
for i in df["Number"]:
    square.append(i * i)

df["Square"] = square


print(df)
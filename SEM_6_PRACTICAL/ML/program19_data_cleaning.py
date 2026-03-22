import pandas as pd
import numpy as np

data = pd.read_csv("data.csv")

# Check null values
print(data.isnull().sum())

# Fill null values
data = data.fillna(data.mean())

# Detect outliers using IQR
Q1 = data.quantile(0.25)
Q3 = data.quantile(0.75)
IQR = Q3 - Q1

outliers = ((data < (Q1 - 1.5*IQR)) | (data > (Q3 + 1.5*IQR)))
print("Outliers:\n", outliers.sum())

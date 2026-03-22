import pandas as pd

# Create dataset
data = {
    'Name': ['DHARMIK', 'HARSHAL', 'SUFIYAN', 'ARSHIL', 'DHARMESH'],
    'Age': [21, 22, 23, 24, 25],
    'Marks': [85, 90, 88, 92, 80]
}

df = pd.DataFrame(data)

# Display full dataset
print("Full Dataset")
print(df)

# Extract rows 1 to 3 and columns Name & Marks
result = df.loc[1:3, ['Name','Marks']]
print("\nExtracted Rows and Columns")
print(result)

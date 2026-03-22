import pandas as pd
from sklearn.preprocessing import OneHotEncoder

data = {
    'color': ['Red','Blue','Green','Blue']
}

df = pd.DataFrame(data)

print("Original DataFrame:")
print(df)

encoder = OneHotEncoder(sparse_output=False)

encoded_data = encoder.fit_transform(df[['color']])

encoded_df = pd.DataFrame(
    encoded_data, 
    columns=encoder.get_feature_names_out(['color'])
                          )

print("\nDataFrame after One-Hot Encoding:")
print(encoded_df)
import numpy as np
from sklearn.impute import SimpleImputer

data = [[1, 2],
        [4, np.nan],
        [7, 6],
        [np.nan, 8]]

imputer = SimpleImputer(strategy='mean')

imputed_data = imputer.fit_transform(data)

print("Display after handling missing values:")
print(imputed_data)

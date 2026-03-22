import numpy as np
from sklearn.preprocessing import MinMaxScaler

data = np.array([[5],[10],[15],[20],[25]])

scaler = MinMaxScaler()
scaled_data = scaler.fit_transform(data)

print("Original Data:\n",data)
print("Scaled Data:\n",scaled_data)
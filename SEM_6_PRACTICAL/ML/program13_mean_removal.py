import numpy as np
from sklearn import preprocessing

data = np.array([[10,20,30],
                 [20,30,40],
                 [30,40,50]])

data_mean_removed = preprocessing.scale(data,with_std=False)

print("Original Data:\n",data)
print("Mean Removed Data:\n",data_mean_removed)
#name : Movaliya Romil Rajeshbhai
#enrollment no. 202103103510247
#class : cse-c1(division -A)
#program : 2

import numpy as np
from scipy.sparse import csr_matrix


dense_matrix = np.array([[1,0,1], [5,2,1], [8,0,3]])

sparse_matrix = csr_matrix(dense_matrix)

print(sparse_matrix)
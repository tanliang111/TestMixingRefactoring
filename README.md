# TestMixingRefactoring
| Mixing Refactoring Types  | Commit |Features|Result|
| ------------- | ------------- |-------------|-------------|
|ExtractMethod + Inline Method	|There is no mixing			
|ExtractMethod + MoveClass (Class is main Class)|	a1365c65fcfbc3e4f3ecab4a979eacb290ccfe26	|Path changed, Package name changed, Same Class, New method |	Extract Method: 32.2% Move Class: 15.5% Rename Package: 44.2% 	
|ExtractMethod + MoveClass (Class is child Class)|	6f66f7369f005a5ae3d64dcb8208cb456a358f7a|	Different package,  same class, remove Class, add class , new method 	|Extract Method: 25.7% Move Class: 47.0% 	
|Extract Method+Pull UP Method	|8331ab9984a6da3504c71bd256161203af092fd9|Same Package, different Class, new method|	Extract Method: 37.8% Pull Up Method: 11.5% Push Down Method: 11.9% 	
|Extract Method+Push Down Method|	There is no mixing			
|Extract Method+Move Method|	8e961ab8037a717589fa4547af7229c862410419|	Different Package, different class, new method|	Extract Method: 33.3% Move Method: 22.3%	
|Extract Method+Move Attribute	|There is no mixing			
|Extract Method+Extract Super Class|	d5c76b0d3de6514af9b2df660cd43eaf95a087b9|	Same Package, new class file, new method, different class|	Extract Method: 22.7% Extract Super Class: 32.0%	
|Extract Method+Extract Interface|There is no mixing			
|Extract Method+Rename Package|	152d6d0004355773b874183641c194f1d9ebe403	|Package name changed, path changed, new method, same class	|Extract Method: 32.2% Rename Package: 44.2%	
|Inline Method+Pull Up Method|	eb6374e8d7b281cef2de443ee67f58248221bf8f|	Same Package, different class, add method, delete method	|Inline Method: 28.4% Pull Up Method: 21.1%	
|Inline Method+Push Down Method|	5802c11be8dc4dc9df177191ddc9ebd9d3ea7c64|	Same Package, different class, delete method, remove method|	Inline Method: 28.4% Push Down Method: 21.4%	
|Inline Method+Move Method|	c9093a0f60d121c01d4a81d652cba200bb9518af|	Different Package, different class, add method, delete method	|Inline Method: 20.0% Move Method: 33.4%	
|Inline Method+Move Class(Class is main Class)|	5cdd19ce406c8a4bb96a63f827458ac46253a6f0|	Package name change, same Class, delete method|	Inline Method: 42.9% Move Class: 12.0% Rename Package: 34.2%	
|Inline Method+Move Class(Class is child Class)|	b1d16ede4bad0eb691b9a38c131b906a9d9e50c5	|Different Package, different Class, add class, remove class, delete method	|Inline Method: 20.0% Move Class: 47.9%	
|Inline Method+Extract SuperClass|	e022bdc61009f7c74f7955e49bb81015a4c7b669|	Same Package, different class, New class file ,delete method	|Inline Method: 22.7% Extract SuperClass: 32.0%	
|Inline Method+Extract Interface	|There is no mixing			
|Inline Method+Rename Package	|ba4b00d5879be082ff197302c87babdbb9f72c44	|Package name changed, Path changed, delete method, same Class|	Inline Method: 32.2% Rename Package: 44.2%	
|Pull Up Method+Push Down Method|	There is no mixing			
|Pull Up Method+Move Method|	dbd091a8cf45f71899a9d28a7b56a3543db2b190	|Different Package, different Class, add method	|Pull Up Method: 23.7% Move Method: 39.0%	
|Pull Up Method+Move Class(Class is main Class)	|eeb07cf3cecff40e2a9803ade79bfcc4f517005e|	Package name changed, Path changed, different package, different class， add method|	Pull Up Method: 14.2% Move Method: 23.4% Move Class: 18.2% Rename Package: 29.6%	
|Pull Up Method+Move Class(Class is child Class)	|There is no mixing			
|Pull Up Method+Extract SuperClass|	3055719aff867e5ab6bfd53906df43b806ca84e0	|Same package, different class, new class file, add method, delete method	|Pull Up Method: 16.9% Extract SuperClass: 32.0%	
|Pull Up Method+Extract Interface|	There is no mixing			
|Pull Up Method+Rename Package|	c1660bba33a0af4062833dd3553eaf615c8c763c	|Package name changed, Path changed, add method, different class|	Pull Up Method: 17.8% Rename Package: 37.1%	
|Push Down Method+Move Method|	91455c85b1387ac595b5dc20e0577bfb5e4f48e8	|Different package, different Class, remove method, add method|	Push Down Method: 18.1% Move Method: 41.7%	
|Push Down Method+Move Class(Class is main Class)|	c562beb09ac12a5eac40c0e3d3017153b99b7ff8|	Package name changed, Path changed, different package, different class, remove method	|Push Down Method: 14.4% Move Class: 18.2% Move Method: 23.4% Rename Package: 29.6% 	
|Push Down Method+Move Class(Class is child Class)|	There is no mixing			
|Push Down Method+Extract SuperClass	|There is no mixing（A Class only inheritance a Class）			
|Push Down Method+Extract Interface	|There is no mixing			
|Push Down Method+Rename Package|	06f8d8d010252351f44f7629adb739250a82cb00	|Package name changed, Path changed, different class, remove method|	Push Down Method: 18.1% Rename Package: 37.1%	
|Move Method+Move Class(Class is main Class)	|e4c2e3baaaf1734cfbbf79524219480760431522	|Package name changed, Path changed, different package, different class, add method, remove method	|Move Method: 27.8% Move Class: 15.2% Rename Package: 24.7%	
|Move Method+Move Class(Class is child Class)|	460f641afa85c20cdae22d725ee1376fa21a2ee8|	Different package, different class, remove class, add class, remove method, add method|	Move Method: 27.8% Move Class: 39.9%	
|Move Method+ Extract SuperClass|	ca08af21199d7e8f7ddd1f90cdafb923e1474954|	Different Package, same package, different Class, remove method, new class file, add method	|Move Method: 24.7%Extract SuperClass: 22.8%	
|Move Method+ Extract Interface|	There is no mixing			
|Move Method+Rename Package	|2ffc4667141ae400fe1e0ebf7d249c773619a6b6|	Package name changed, Path changed, different package, different class, add method, remove method	|Move Method: 27.8% Rename Package: 24.7%	
|Move Class+Extract SuperClass(Class is main Class)	|df52393f0a079c4db2d69debae1e330f554e5dcc|	Package name changed, Path changed, same package, different class, new class file|	Move Class: 13.0% Extract SuperClass: 26.7% Rename Package: 24.7%	
|Move Class+Extract SuperClass(Class is child Class)	|c73a334db86ce8cc18338edd3e3b37f62fc16c57|	Package name changed, Path changed, same package, different class, new class file, remove class, add class	|Move Class: 34.7% Extract SuperClass: 20.0%	
|Move Class(Class is main Class)+Extract Interface|	7a45135da3bda80b22538f200802d0ebc8435466	|Same package, Package name changed, path changed, new interface, add file	|Move Class: 12.7% Extract Interface: 32.0% Rename Package: 29.6%	
|Move Class(Class is child Class)+Extract Interface|	90a57b4043213a395adfd5a646c0bfac812e5cd6|	Different package, different Class, new interface, new file, add class, remove class, same class	|Move Class: 36.6% Extract Interface: 20.9%	
|Move Class+Rename Package(Class is main Class)	|65c1bbe127d885eb0dee15ea68cb64cd367bf367	|Package name changed, Path changed, same class|	Move Class: 20.6% Rename Package: 58.9%	
|Move Class+Rename Package (Class is child Class)|	c851ddc6b4f0aae6e9c37a4e90a30633f87795b9|	Different Package, Package name changed, Path changed, add class, remove class , different class, same class|	Move Class: 43.0% Rename Package: 25.3%	
|Extract SuperClass+Extract Interface|	There is no mixing			
|Extract SuperClass+Rename Package|	5647743a3fe60d1cd1327ac13d736a65dff01aef	|Package name changed, Path changed, new class file, same class	|Extract SuperClass: 29.3% Rename Package: 35.4%	
|Extract Interface+Rename Package|	fcd9467b205fde237389fcb5f834a835c4629651	|Package name changed, Path changed, new interface file, same package, same class	|Extract Interface: 26.7% Rename Package: 28.8%	
|Move Attribute+Move Class(Class is main Class)|	9cbce24ab67938aad28e7294e65e8245e6a2f4b8|	Different package, different class, package name changed, path changed, add attribute, remove attribute	|Move Attribute: 41.7% Move Class: 15.2% Rename Package: 24.7%	
|Move Attribute+Move Class(Class is child Class)|	f34b24ebbde75aa7038a33475ff4d308b42095f6|	Different package, different class, add attribute, remove attribute, remove class, add class	|Move Attribute: 41.7% Move Class: 39.9%	
|Move Attribute+Extract SuperClass|There is no mixing			
|Move Attribute+Extract Interface|	There is no mixing			
|Move Attribute+Rename Package|	58f7e89b611f0b3c890a94b67529f8792c61bb07	|Different package, different class, package name changed, path changed, add attribute, remove attribute|	Move Attribute: 41.7% Rename Package: 24.7%	



/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.scdn.transform.v20171115;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnCertificateDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnCertificateDetailResponseUnmarshaller {

	public static DescribeScdnCertificateDetailResponse unmarshall(DescribeScdnCertificateDetailResponse describeScdnCertificateDetailResponse, UnmarshallerContext context) {
		
		describeScdnCertificateDetailResponse.setRequestId(context.stringValue("DescribeScdnCertificateDetailResponse.RequestId"));
		describeScdnCertificateDetailResponse.setCert(context.stringValue("DescribeScdnCertificateDetailResponse.Cert"));
		describeScdnCertificateDetailResponse.setKey(context.stringValue("DescribeScdnCertificateDetailResponse.Key"));
		describeScdnCertificateDetailResponse.setCertId(context.longValue("DescribeScdnCertificateDetailResponse.CertId"));
		describeScdnCertificateDetailResponse.setCertName(context.stringValue("DescribeScdnCertificateDetailResponse.CertName"));
	 
	 	return describeScdnCertificateDetailResponse;
	}
}
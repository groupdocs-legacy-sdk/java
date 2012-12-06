/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureEnvelopeInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureEnvelopesResult {
  private Integer envelopesCount = null;
  private List<SignatureEnvelopeInfo> envelopes = new ArrayList<SignatureEnvelopeInfo>();
  public Integer getEnvelopesCount() {
    return envelopesCount;
  }
  public void setEnvelopesCount(Integer envelopesCount) {
    this.envelopesCount = envelopesCount;
  }

  public List<SignatureEnvelopeInfo> getEnvelopes() {
    return envelopes;
  }
  public void setEnvelopes(List<SignatureEnvelopeInfo> envelopes) {
    this.envelopes = envelopes;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureEnvelopesResult {\n");
    sb.append("  envelopesCount: ").append(envelopesCount).append("\n");
    sb.append("  envelopes: ").append(envelopes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


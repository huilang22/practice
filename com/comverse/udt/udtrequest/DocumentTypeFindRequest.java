/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeFindRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DocumentTypeFindRequest Udt Request
 *
 */

public class DocumentTypeFindRequest extends DocumentTypeRequest {
/**
 *
 * Constructor to create a  DocumentTypeFindRequest
 * @param id Unique request name
 * @param DocTypefind_In DocumentTypeObjectFilter for DocumentTypeFindRequest
 *
 */
@JsonCreator
  public DocumentTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentType")DocumentTypeObjectFilter DocTypefind_In) {
    super(id, "DocumentTypeFind");
    if (DocTypefind_In != null) {
      Integer index =  DocTypefind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(DocTypefind_In, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }

/**
 *
 * Retrieves the DocumentTypeObjectDataList that results from the DocumentTypeFindRequest call
 * @return DocumentTypeObjectDataList resulting from udt call
 *
 */

  public DocumentTypeObjectDataList getOutput() {
    return DocumentTypeObjectHelper.fromMapList(outputMap, "DocumentTypeList");
  }
}

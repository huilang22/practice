/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeGetRequest.java
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
 * Class used to create a DocumentTypeGetRequest Udt Request
 *
 */

public class DocumentTypeGetRequest extends DocumentTypeSubRequestParent {
/**
 *
 * Constructor to create a  DocumentTypeGetRequest
 * @param id Unique request name
 * @param DocTypeget_In DocumentTypeObjectKeyData for DocumentTypeGetRequest
 *
 */
@JsonCreator
  public DocumentTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentType")DocumentTypeObjectKeyData DocTypeget_In) {
    super(id, "DocumentTypeGet");
    if (DocTypeget_In != null) {
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(DocTypeget_In, new HashMap(), "DocumentTypeObjectKeyData").get("DocumentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DocumentTypeObjectData that results from the DocumentTypeGetRequest call
 * @return DocumentTypeObjectData resulting from udt call
 *
 */

  public DocumentTypeObjectData getOutput() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
}

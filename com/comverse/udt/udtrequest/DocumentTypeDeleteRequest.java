/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeDeleteRequest.java
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
 * Class used to create a DocumentTypeDeleteRequest Udt Request
 *
 */

public class DocumentTypeDeleteRequest extends DocumentTypeSubRequestParent {
/**
 *
 * Constructor to create a  DocumentTypeDeleteRequest
 * @param id Unique request name
 * @param DocTypedelete_In DocumentTypeObjectKeyData for DocumentTypeDeleteRequest
 *
 */
@JsonCreator
  public DocumentTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentType")DocumentTypeObjectKeyData DocTypedelete_In) {
    super(id, "DocumentTypeDelete");
    if (DocTypedelete_In != null) {
      addInput("DocumentType", DocumentTypeObjectKeyHelper.toMap(DocTypedelete_In, new HashMap(), "DocumentTypeObjectKeyData").get("DocumentTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DocumentTypeObjectData that results from the DocumentTypeDeleteRequest call
 * @return DocumentTypeObjectData resulting from udt call
 *
 */

  public DocumentTypeObjectData getOutput() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
}

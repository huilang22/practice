/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DocumentTypeCreateRequest.java
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
 * Class used to create a DocumentTypeCreateRequest Udt Request
 *
 */

public class DocumentTypeCreateRequest extends DocumentTypeSubRequestParent {
/**
 *
 * Constructor to create a  DocumentTypeCreateRequest
 * @param id Unique request name
 * @param DocTypecreate_In DocumentTypeObjectData for DocumentTypeCreateRequest
 *
 */
@JsonCreator
  public DocumentTypeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentType")DocumentTypeObjectData DocTypecreate_In) {
    super(id, "DocumentTypeCreate");
    if (DocTypecreate_In != null) {
      addInput("DocumentType", DocumentTypeObjectHelper.toMap(DocTypecreate_In, new HashMap(), "DocumentType").get("DocumentType"));
    }
  }

/**
 *
 * Retrieves the DocumentTypeObjectData that results from the DocumentTypeCreateRequest call
 * @return DocumentTypeObjectData resulting from udt call
 *
 */

  public DocumentTypeObjectData getOutput() {
    return DocumentTypeObjectHelper.fromMap(outputMap, "DocumentType");
  }
}

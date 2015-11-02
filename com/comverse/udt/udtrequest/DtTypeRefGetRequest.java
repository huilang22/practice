/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DtTypeRefGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a DtTypeRefGetRequest Udt Request
 *
 */

public class DtTypeRefGetRequest extends DocumentTypeRefSubRequestParent {
/**
 *
 * Constructor to create a  DtTypeRefGetRequest
 * @param id Unique request name
 * @param DocTypeRefFindIn DocumentTypeRefObjectKeyData for DtTypeRefGetRequest
 *
 */
@JsonCreator
  public DtTypeRefGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("DocumentTypeRef")DocumentTypeRefObjectKeyData DocTypeRefFindIn) {
    super(id, "DtTypeRefGet");
    if (DocTypeRefFindIn != null) {
      addInput("DocumentTypeRef", DocumentTypeRefObjectKeyHelper.toMap(DocTypeRefFindIn, new HashMap(), "DocumentTypeRefObjectKeyData").get("DocumentTypeRefObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DocumentTypeRefObjectData that results from the DtTypeRefGetRequest call
 * @return DocumentTypeRefObjectData resulting from udt call
 *
 */

  public DocumentTypeRefObjectData getOutput() {
    return DocumentTypeRefObjectHelper.fromMap(outputMap, "DocumentTypeRef");
  }
}

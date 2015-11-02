/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerDocumentCreateRequest.java
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
 * Class used to create a CustomerDocumentCreateRequest Udt Request
 *
 */

public class CustomerDocumentCreateRequest extends CustomerDocumentSubRequestParent {
/**
 *
 * Constructor to create a  CustomerDocumentCreateRequest
 * @param id Unique request name
 * @param CustomerDocumentCreateIn CustomerDocumentObjectData for CustomerDocumentCreateRequest
 *
 */
@JsonCreator
  public CustomerDocumentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerDocument")CustomerDocumentObjectData CustomerDocumentCreateIn) {
    super(id, "CustomerDocumentCreate");
    if (CustomerDocumentCreateIn != null) {
      addInput("CustomerDocument", CustomerDocumentObjectHelper.toMap(CustomerDocumentCreateIn, new HashMap(), "CustomerDocument").get("CustomerDocument"));
    }
  }

/**
 *
 * Retrieves the CustomerDocumentObjectData that results from the CustomerDocumentCreateRequest call
 * @return CustomerDocumentObjectData resulting from udt call
 *
 */

  public CustomerDocumentObjectData getOutput() {
    return CustomerDocumentObjectHelper.fromMap(outputMap, "CustomerDocument");
  }
}

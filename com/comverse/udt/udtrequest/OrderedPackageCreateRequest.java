/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedPackageCreateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a OrderedPackageCreateRequest Udt Request
 *
 */

public class OrderedPackageCreateRequest extends OrderedPackageSubRequestParent {
/**
 *
 * Constructor to create a  OrderedPackageCreateRequest
 * @param id Unique request name
 * @param opcPackageIn ProductPackageObjectData for OrderedPackageCreateRequest
 * @param opcOrderIn OrderObjectData for OrderedPackageCreateRequest
 * @param opcServiceOrderIn ServiceOrderObjectData for OrderedPackageCreateRequest
 * @param opcFindExistingSO Boolean for OrderedPackageCreateRequest
 * @param opcVerboseResponse Boolean for OrderedPackageCreateRequest
 *
 */
@JsonCreator
  public OrderedPackageCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ProductPackage")ProductPackageObjectData opcPackageIn, @JsonProperty("Order")OrderObjectData opcOrderIn, @JsonProperty("ServiceOrder")ServiceOrderObjectData opcServiceOrderIn, @JsonProperty("FindExistingSO")Boolean opcFindExistingSO, @JsonProperty("VerboseResponse")Boolean opcVerboseResponse) {
    super(id, "OrderedPackageCreate");
    if (opcPackageIn != null) {
      addInput("ProductPackage", ProductPackageObjectHelper.toMap(opcPackageIn, new HashMap(), "OrderedPackageCreateOutputData").get("OrderedPackageCreateOutputData"));
    }
    if (opcOrderIn != null) {
      addInput("Order", OrderObjectHelper.toMap(opcOrderIn, new HashMap(), "OrderedPackageCreateOutputData").get("OrderedPackageCreateOutputData"));
    }
    if (opcServiceOrderIn != null) {
      addInput("ServiceOrder", ServiceOrderObjectHelper.toMap(opcServiceOrderIn, new HashMap(), "OrderedPackageCreateOutputData").get("OrderedPackageCreateOutputData"));
    }
    if (opcFindExistingSO != null) {
      addInput("FindExistingSO", opcFindExistingSO);
    }
    if (opcVerboseResponse != null) {
      addInput("VerboseResponse", opcVerboseResponse);
    }
  }

/**
 *
 * Retrieves the OrderedPackageCreateOutputData that results from the OrderedPackageCreateRequest call
 * @return OrderedPackageCreateOutputData resulting from udt call
 *
 */

  public OrderedPackageCreateOutputData getOutput() {
    return OrderedPackageCreateOutputHelper.fromMap(outputMap);
  }
}

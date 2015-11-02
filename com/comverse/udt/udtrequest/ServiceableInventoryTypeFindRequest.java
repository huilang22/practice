/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceableInventoryTypeFindRequest.java
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
import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceableInventoryTypeFindRequest Udt Request
 *
 */

public class ServiceableInventoryTypeFindRequest extends ServiceableInventoryTypeRequest {
/**
 *
 * Constructor to create a  ServiceableInventoryTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServiceableInventoryTypeFindRequest
 *
 */
@JsonCreator
  public ServiceableInventoryTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn) {
    super(id, "ServiceableInventoryTypeFind");
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectDataList that results from the ServiceableInventoryTypeFindRequest call
 * @return InvsTypeObjectDataList resulting from udt call
 *
 */

  public InvsTypeObjectDataList getOutput() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}

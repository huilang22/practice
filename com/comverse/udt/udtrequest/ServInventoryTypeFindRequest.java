/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServInventoryTypeFindRequest.java
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
import com.csgsystems.svbl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServInventoryTypeFindRequest Udt Request
 *
 */

public class ServInventoryTypeFindRequest extends ServInventoryTypeRequest {
/**
 *
 * Constructor to create a  ServInventoryTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServInventoryTypeFindRequest
 *
 */
@JsonCreator
  public ServInventoryTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn) {
    super(id, "ServInventoryTypeFind");
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
  }

/**
 *
 * Retrieves the InvsTypeObjectDataList that results from the ServInventoryTypeFindRequest call
 * @return InvsTypeObjectDataList resulting from udt call
 *
 */

  public InvsTypeObjectDataList getOutput() {
    return InvsTypeObjectHelper.fromMapList(outputMap, "InvsTypeList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServPackageTypeFindRequest.java
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
 * Class used to create a ServPackageTypeFindRequest Udt Request
 *
 */

public class ServPackageTypeFindRequest extends ServPackageTypeRequest {
/**
 *
 * Constructor to create a  ServPackageTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServPackageTypeFindRequest
 * @param IndustryTypeId Integer for ServPackageTypeFindRequest
 * @param ServiceableDt Date for ServPackageTypeFindRequest
 *
 */
@JsonCreator
  public ServPackageTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn, @JsonProperty("IndustryTypeId")Integer IndustryTypeId, @JsonProperty("ServiceableDt")Date ServiceableDt) {
    super(id, "ServPackageTypeFind");
    if (AddressIdIn != null) {
      addInput("AddressIdIn", AddressIdIn);
    }
    if (IndustryTypeId != null) {
      addInput("IndustryTypeId", IndustryTypeId);
    }
    if (ServiceableDt != null) {
      addInput("ServiceableDt", ServiceableDt);
    }
  }

/**
 *
 * Retrieves the PDObjectDataList that results from the ServPackageTypeFindRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}

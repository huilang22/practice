/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceablePackageTypeFindRequest.java
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
import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ServiceablePackageTypeFindRequest Udt Request
 *
 */

public class ServiceablePackageTypeFindRequest extends ServiceablePackageTypeRequest {
/**
 *
 * Constructor to create a  ServiceablePackageTypeFindRequest
 * @param id Unique request name
 * @param AddressIdIn BigInteger for ServiceablePackageTypeFindRequest
 * @param IndustryTypeId Integer for ServiceablePackageTypeFindRequest
 * @param ServiceableDt Date for ServiceablePackageTypeFindRequest
 *
 */
@JsonCreator
  public ServiceablePackageTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressIdIn")BigInteger AddressIdIn, @JsonProperty("IndustryTypeId")Integer IndustryTypeId, @JsonProperty("ServiceableDt")Date ServiceableDt) {
    super(id, "ServiceablePackageTypeFind");
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
 * Retrieves the PDObjectDataList that results from the ServiceablePackageTypeFindRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}

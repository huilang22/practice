/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CustomerIdEquipMapDeleteRequest.java
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
 * Class used to create a CustomerIdEquipMapDeleteRequest Udt Request
 *
 */

public class CustomerIdEquipMapDeleteRequest extends CustomerIdEquipMapSubRequestParent {
/**
 *
 * Constructor to create a  CustomerIdEquipMapDeleteRequest
 * @param id Unique request name
 * @param CustomerIdEquipMapDeleteIn CustomerIdEquipMapObjectKeyData for CustomerIdEquipMapDeleteRequest
 * @param CIEMDCeaseDate Date for CustomerIdEquipMapDeleteRequest
 *
 */
@JsonCreator
  public CustomerIdEquipMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CustomerIdEquipMap")CustomerIdEquipMapObjectKeyData CustomerIdEquipMapDeleteIn, @JsonProperty("InactiveDate")Date CIEMDCeaseDate) {
    super(id, "CustomerIdEquipMapDelete");
    if (CustomerIdEquipMapDeleteIn != null) {
      addInput("CustomerIdEquipMap", CustomerIdEquipMapObjectKeyHelper.toMap(CustomerIdEquipMapDeleteIn, new HashMap(), "CustomerIdEquipMapObjectKeyData").get("CustomerIdEquipMapObjectKeyData"));
    }
    if (CIEMDCeaseDate != null) {
      addInput("InactiveDate", CIEMDCeaseDate);
    }
  }

/**
 *
 * Retrieves the CustomerIdEquipMapObjectData that results from the CustomerIdEquipMapDeleteRequest call
 * @return CustomerIdEquipMapObjectData resulting from udt call
 *
 */

  public CustomerIdEquipMapObjectData getOutput() {
    return CustomerIdEquipMapObjectHelper.fromMap(outputMap, "CustomerIdEquipMap");
  }
}

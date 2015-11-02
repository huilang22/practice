/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindByAddressRequest.java
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
 * Class used to create a IndustryTypeFindByAddressRequest Udt Request
 *
 */

public class IndustryTypeFindByAddressRequest extends IndustryTypeRequest {
/**
 *
 * Constructor to create a  IndustryTypeFindByAddressRequest
 * @param id Unique request name
 * @param address_id Integer for IndustryTypeFindByAddressRequest
 * @param _language_code Integer for IndustryTypeFindByAddressRequest
 *
 */
@JsonCreator
  public IndustryTypeFindByAddressRequest(@JsonProperty("RequestId") String id, @JsonProperty("AddressId")Integer address_id, @JsonProperty("LanguageCode")Integer _language_code) {
    super(id, "IndustryTypeFindByAddress");
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
    if (_language_code != null) {
      addInput("LanguageCode", _language_code);
    }
  }

/**
 *
 * Retrieves the IndustryTypeObjectDataList that results from the IndustryTypeFindByAddressRequest call
 * @return IndustryTypeObjectDataList resulting from udt call
 *
 */

  public IndustryTypeObjectDataList getOutput() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
}

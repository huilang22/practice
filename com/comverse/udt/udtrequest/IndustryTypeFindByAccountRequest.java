/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindByAccountRequest.java
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
 * Class used to create a IndustryTypeFindByAccountRequest Udt Request
 *
 */

public class IndustryTypeFindByAccountRequest extends IndustryTypeRequest {
/**
 *
 * Constructor to create a  IndustryTypeFindByAccountRequest
 * @param id Unique request name
 * @param account_internal_id Integer for IndustryTypeFindByAccountRequest
 * @param language_code Integer for IndustryTypeFindByAccountRequest
 *
 */
@JsonCreator
  public IndustryTypeFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountInternalId")Integer account_internal_id, @JsonProperty("LanguageCode")Integer language_code) {
    super(id, "IndustryTypeFindByAccount");
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
  }

/**
 *
 * Retrieves the IndustryTypeObjectDataList that results from the IndustryTypeFindByAccountRequest call
 * @return IndustryTypeObjectDataList resulting from udt call
 *
 */

  public IndustryTypeObjectDataList getOutput() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindByAccountRequest.java
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
 * Class used to create a ContractTypeFindByAccountRequest Udt Request
 *
 */

public class ContractTypeFindByAccountRequest extends ContractTypeRequest {
/**
 *
 * Constructor to create a  ContractTypeFindByAccountRequest
 * @param id Unique request name
 * @param language_code Integer for ContractTypeFindByAccountRequest
 * @param account_internal_id Integer for ContractTypeFindByAccountRequest
 *
 */
@JsonCreator
  public ContractTypeFindByAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer language_code, @JsonProperty("AccountInternalId")Integer account_internal_id) {
    super(id, "ContractTypeFindByAccount");
    if (language_code != null) {
      addInput("LanguageCode", language_code);
    }
    if (account_internal_id != null) {
      addInput("AccountInternalId", account_internal_id);
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectDataList that results from the ContractTypeFindByAccountRequest call
 * @return ContractTypeObjectDataList resulting from udt call
 *
 */

  public ContractTypeObjectDataList getOutput() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
}

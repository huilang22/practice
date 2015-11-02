/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindByServiceRequest.java
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
 * Class used to create a ContractTypeFindByServiceRequest Udt Request
 *
 */

public class ContractTypeFindByServiceRequest extends ContractTypeRequest {
/**
 *
 * Constructor to create a  ContractTypeFindByServiceRequest
 * @param id Unique request name
 * @param LanguageCode Integer for ContractTypeFindByServiceRequest
 * @param service_internal_id Integer for ContractTypeFindByServiceRequest
 * @param service_internal_id_resets Integer for ContractTypeFindByServiceRequest
 *
 */
@JsonCreator
  public ContractTypeFindByServiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer LanguageCode, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets) {
    super(id, "ContractTypeFindByService");
    if (LanguageCode != null) {
      addInput("LanguageCode", LanguageCode);
    }
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
  }

/**
 *
 * Retrieves the ContractTypeObjectDataList that results from the ContractTypeFindByServiceRequest call
 * @return ContractTypeObjectDataList resulting from udt call
 *
 */

  public ContractTypeObjectDataList getOutput() {
    return ContractTypeObjectHelper.fromMapList(outputMap, "ContractTypeList");
  }
}

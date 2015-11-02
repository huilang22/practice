/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindByServiceRequest.java
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
 * Class used to create a NrcTransDescrFindByServiceRequest Udt Request
 *
 */

public class NrcTransDescrFindByServiceRequest extends NrcTransDescrRequest {
/**
 *
 * Constructor to create a  NrcTransDescrFindByServiceRequest
 * @param id Unique request name
 * @param LanguageCode Integer for NrcTransDescrFindByServiceRequest
 * @param service_internal_id Integer for NrcTransDescrFindByServiceRequest
 * @param service_internal_id_resets Integer for NrcTransDescrFindByServiceRequest
 *
 */
@JsonCreator
  public NrcTransDescrFindByServiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer LanguageCode, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets) {
    super(id, "NrcTransDescrFindByService");
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
 * Retrieves the NrcTransDescrObjectDataList that results from the NrcTransDescrFindByServiceRequest call
 * @return NrcTransDescrObjectDataList resulting from udt call
 *
 */

  public NrcTransDescrObjectDataList getOutput() {
    return NrcTransDescrObjectHelper.fromMapList(outputMap, "NrcTransDescrList");
  }
}

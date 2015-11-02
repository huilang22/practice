/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindByComponentServiceRequest.java
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
 * Class used to create a PackageDefinitionFindByComponentServiceRequest Udt Request
 *
 */

public class PackageDefinitionFindByComponentServiceRequest extends PackageDefinitionRequest {
/**
 *
 * Constructor to create a  PackageDefinitionFindByComponentServiceRequest
 * @param id Unique request name
 * @param service_internal_id Integer for PackageDefinitionFindByComponentServiceRequest
 * @param service_internal_id_resets Integer for PackageDefinitionFindByComponentServiceRequest
 * @param __language_code Integer for PackageDefinitionFindByComponentServiceRequest
 *
 */
@JsonCreator
  public PackageDefinitionFindByComponentServiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets, @JsonProperty("LanguageCode")Integer __language_code) {
    super(id, "PackageDefinitionFindByComponentService");
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (__language_code != null) {
      addInput("LanguageCode", __language_code);
    }
  }

/**
 *
 * Retrieves the PDObjectDataList that results from the PackageDefinitionFindByComponentServiceRequest call
 * @return PDObjectDataList resulting from udt call
 *
 */

  public PDObjectDataList getOutput() {
    return PDObjectHelper.fromMapList(outputMap, "PackageDefinitionList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageComponentDefFindByServiceRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PackageComponentDefFindByServiceRequest Udt Request
 *
 */

public class PackageComponentDefFindByServiceRequest extends PackageComponentDefRequest {
/**
 *
 * Constructor to create a  PackageComponentDefFindByServiceRequest
 * @param id Unique request name
 * @param LanguageCode Integer for PackageComponentDefFindByServiceRequest
 * @param service_internal_id Integer for PackageComponentDefFindByServiceRequest
 * @param service_internal_id_resets Integer for PackageComponentDefFindByServiceRequest
 *
 */
@JsonCreator
  public PackageComponentDefFindByServiceRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")Integer LanguageCode, @JsonProperty("ServiceInternalId")Integer service_internal_id, @JsonProperty("ServiceInternalIdResets")Integer service_internal_id_resets) {
    super(id, "PackageComponentDefFindByService");
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
 * Retrieves the PCDObjectDataList that results from the PackageComponentDefFindByServiceRequest call
 * @return PCDObjectDataList resulting from udt call
 *
 */

  public PCDObjectDataList getOutput() {
    return PCDObjectHelper.fromMapList(outputMap, "PackageComponentDefList");
  }
}

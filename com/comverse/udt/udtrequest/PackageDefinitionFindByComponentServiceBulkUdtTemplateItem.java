/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PackageDefinitionFindByComponentServiceBulkUdtTemplateItem.java
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

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a PackageDefinitionFindByComponentServiceBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageDefinitionFindByComponentServiceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
  protected Integer __language_code;
/**
 *
 * Constructor to create a  PackageDefinitionFindByComponentServiceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageDefinitionFindByComponentServiceBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer service_internal_idIn, Integer service_internal_id_resetsIn, Integer __language_codeIn) {
    super(id, context, "PackageDefinitionFindByComponentService");
    service_internal_id = service_internal_idIn;
    service_internal_id_resets = service_internal_id_resetsIn;
    __language_code = __language_codeIn;
  }

  public void translateToMap() {
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
 * Sets the ServiceInternalId
 * @param service_internal_idIn Value of the service_internal_id
 *
 */

  public void setServiceInternalId(Integer service_internal_idIn) {
    service_internal_id = service_internal_idIn;
  }

/**
 *
 * Sets the ServiceInternalIdResets
 * @param service_internal_id_resetsIn Value of the service_internal_id_resets
 *
 */

  public void setServiceInternalIdResets(Integer service_internal_id_resetsIn) {
    service_internal_id_resets = service_internal_id_resetsIn;
  }

/**
 *
 * Sets the LanguageCode
 * @param __language_codeIn Value of the __language_code
 *
 */

  public void setLanguageCode(Integer __language_codeIn) {
    __language_code = __language_codeIn;
  }

  public void translateFromMap() {
    service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
    __language_code = (Integer)inputMap.get("LanguageCode");
  }

/**
 *
 * Gets the ServiceInternalId
 * @return Value of the ServiceInternalId
 *
 */

  public Integer getServiceInternalId( ) {
    return service_internal_id;
  }

/**
 *
 * Gets the ServiceInternalIdResets
 * @return Value of the ServiceInternalIdResets
 *
 */

  public Integer getServiceInternalIdResets( ) {
    return service_internal_id_resets;
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return __language_code;
  }

}

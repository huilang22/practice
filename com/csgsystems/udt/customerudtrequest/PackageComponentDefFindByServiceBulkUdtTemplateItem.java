/*
 * Generated code DO NOT EDIT
 * Generated file: PackageComponentDefFindByServiceBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a PackageComponentDefFindByServiceBulkUdtTemplateItem Bulk Template
 *
 */

public class PackageComponentDefFindByServiceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer LanguageCode;
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
/**
 *
 * Constructor to create a  PackageComponentDefFindByServiceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PackageComponentDefFindByServiceBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer LanguageCodeIn, Integer service_internal_idIn, Integer service_internal_id_resetsIn) {
    super(id, context, "PackageComponentDefFindByService");
    LanguageCode = LanguageCodeIn;
    service_internal_id = service_internal_idIn;
    service_internal_id_resets = service_internal_id_resetsIn;
  }

  public void translateToMap() {
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
 * Sets the LanguageCode
 * @param LanguageCodeIn Value of the LanguageCode
 *
 */

  public void setLanguageCode(Integer LanguageCodeIn) {
    LanguageCode = LanguageCodeIn;
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

  public void translateFromMap() {
    LanguageCode = (Integer)inputMap.get("LanguageCode");
    service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
  }

/**
 *
 * Gets the LanguageCode
 * @return Value of the LanguageCode
 *
 */

  public Integer getLanguageCode( ) {
    return LanguageCode;
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

}

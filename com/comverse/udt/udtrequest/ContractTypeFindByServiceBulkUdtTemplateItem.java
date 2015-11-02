/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ContractTypeFindByServiceBulkUdtTemplateItem.java
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
 * Class used to create a ContractTypeFindByServiceBulkUdtTemplateItem Bulk Template
 *
 */

public class ContractTypeFindByServiceBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer LanguageCode;
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
/**
 *
 * Constructor to create a  ContractTypeFindByServiceBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ContractTypeFindByServiceBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer LanguageCodeIn, Integer service_internal_idIn, Integer service_internal_id_resetsIn) {
    super(id, context, "ContractTypeFindByService");
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

/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceDisconnectChargeAmountGetBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ServiceDisconnectChargeAmountGetBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceDisconnectChargeAmountGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
  protected Date _effective_date;
/**
 *
 * Constructor to create a  ServiceDisconnectChargeAmountGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceDisconnectChargeAmountGetBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer service_internal_idIn, Integer service_internal_id_resetsIn, Date _effective_dateIn) {
    super(id, context, "ServiceDisconnectChargeAmountGet");
    service_internal_id = service_internal_idIn;
    service_internal_id_resets = service_internal_id_resetsIn;
    _effective_date = _effective_dateIn;
  }

  public void translateToMap() {
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
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
 * Sets the EffectiveDate
 * @param _effective_dateIn Value of the _effective_date
 *
 */

  public void setEffectiveDate(Date _effective_dateIn) {
    _effective_date = _effective_dateIn;
  }

  public void translateFromMap() {
    service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
    _effective_date = (Date)inputMap.get("EffectiveDate");
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
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return _effective_date;
  }

}

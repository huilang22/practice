/*
 * Generated code DO NOT EDIT
 * Generated file: RTUnitCreditBalanceQueryBulkUdtTemplateItem.java
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
 * Class used to create a RTUnitCreditBalanceQueryBulkUdtTemplateItem Bulk Template
 *
 */

public class RTUnitCreditBalanceQueryBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected Integer is_prepaid;
  protected Integer service_internal_id;
  protected Integer service_internal_id_resets;
  protected Integer granularity;
/**
 *
 * Constructor to create a  RTUnitCreditBalanceQueryBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RTUnitCreditBalanceQueryBulkUdtTemplateItem(String id, BSDMSessionContext context, Integer is_prepaidIn, Integer service_internal_idIn, Integer service_internal_id_resetsIn, Integer granularityIn) {
    super(id, context, "RTUnitCreditBalanceQuery");
    is_prepaid = is_prepaidIn;
    service_internal_id = service_internal_idIn;
    service_internal_id_resets = service_internal_id_resetsIn;
    granularity = granularityIn;
  }

  public void translateToMap() {
    if (is_prepaid != null) {
      addInput("IsPrepaid", is_prepaid);
    }
    if (service_internal_id != null) {
      addInput("ServiceInternalId", service_internal_id);
    }
    if (service_internal_id_resets != null) {
      addInput("ServiceInternalIdResets", service_internal_id_resets);
    }
    if (granularity != null) {
      addInput("Granularity", granularity);
    }
  }


/**
 *
 * Sets the IsPrepaid
 * @param is_prepaidIn Value of the is_prepaid
 *
 */

  public void setIsPrepaid(Integer is_prepaidIn) {
    is_prepaid = is_prepaidIn;
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
 * Sets the Granularity
 * @param granularityIn Value of the granularity
 *
 */

  public void setGranularity(Integer granularityIn) {
    granularity = granularityIn;
  }

  public void translateFromMap() {
    is_prepaid = (Integer)inputMap.get("IsPrepaid");
    service_internal_id = (Integer)inputMap.get("ServiceInternalId");
    service_internal_id_resets = (Integer)inputMap.get("ServiceInternalIdResets");
    granularity = (Integer)inputMap.get("Granularity");
  }

/**
 *
 * Gets the IsPrepaid
 * @return Value of the IsPrepaid
 *
 */

  public Integer getIsPrepaid( ) {
    return is_prepaid;
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
 * Gets the Granularity
 * @return Value of the Granularity
 *
 */

  public Integer getGranularity( ) {
    return granularity;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceZoneCancelBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ServiceZoneCancelBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceZoneCancelBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceZoneObjectData SZCancelIn;
  protected Date SZCCeaseDate;
/**
 *
 * Constructor to create a  ServiceZoneCancelBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceZoneCancelBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceZoneObjectData SZCancelInIn, Date SZCCeaseDateIn) {
    super(id, context, "ServiceZoneCancel");
    SZCancelIn = SZCancelInIn;
    SZCCeaseDate = SZCCeaseDateIn;
  }

  public void translateToMap() {
    if (SZCancelIn != null) {
      SZCancelIn.resetFlags(true, true);
      addInput("ServiceZone", ServiceZoneObjectHelper.toMap(SZCancelIn, new HashMap(), "Void").get("Void"));
    }
    if (SZCCeaseDate != null) {
      addInput("CancelDate", SZCCeaseDate);
    }
  }


/**
 *
 * Sets the ServiceZone
 * @param SZCancelInIn Value of the SZCancelIn
 *
 */

  public void setServiceZone(ServiceZoneObjectData SZCancelInIn) {
    SZCancelIn = SZCancelInIn;
  }

/**
 *
 * Sets the CancelDate
 * @param SZCCeaseDateIn Value of the SZCCeaseDate
 *
 */

  public void setCancelDate(Date SZCCeaseDateIn) {
    SZCCeaseDate = SZCCeaseDateIn;
  }

  public void translateFromMap() {
    SZCancelIn = ServiceZoneObjectHelper.fromMap(inputMap, "ServiceZone");
    SZCCeaseDate = (Date)inputMap.get("CancelDate");
  }

/**
 *
 * Gets the ServiceZone
 * @return Value of the ServiceZone
 *
 */

  public ServiceZoneObjectData getServiceZone( ) {
    return SZCancelIn;
  }

/**
 *
 * Gets the CancelDate
 * @return Value of the CancelDate
 *
 */

  public Date getCancelDate( ) {
    return SZCCeaseDate;
  }

}

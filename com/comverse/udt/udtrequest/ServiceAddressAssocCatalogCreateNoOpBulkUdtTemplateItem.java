/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ServiceAddressAssocCatalogCreateNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceAddressAssocCatalogCreateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressAssocCatalogCreateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressAssocCatalogObjData noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogCreateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogCreateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjData noOpInIn) {
    super(id, context, "ServiceAddressAssocCatalogCreate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(noOpIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }
/**
 *
 * Sets the  ServiceAddressAssocCatalog
 * @param noOpInIn ServiceAddressAssocCatalogObjData to set
 *
 */
  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceAddressAssocCatalog passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalog() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceAddressAssocCatalogObjHelper.fromMap(inputMap, "ServiceAddressAssocCatalog");
  }
}

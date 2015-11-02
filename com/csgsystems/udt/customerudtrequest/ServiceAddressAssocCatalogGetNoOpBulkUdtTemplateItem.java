/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceAddressAssocCatalogGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressAssocCatalogGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressAssocCatalogObjData noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjData noOpInIn) {
    super(id, context, "ServiceAddressAssocCatalogGet");
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

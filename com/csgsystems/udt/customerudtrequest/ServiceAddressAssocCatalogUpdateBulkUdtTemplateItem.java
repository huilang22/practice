/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ServiceAddressAssocCatalogUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ServiceAddressAssocCatalogUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ServiceAddressAssocCatalogObjData updateIn;
/**
 *
 * Constructor to create a  ServiceAddressAssocCatalogUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ServiceAddressAssocCatalogUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjData updateInIn) {
    super(id, context, "ServiceAddressAssocCatalogUpdate");
    updateIn = updateInIn;
  }

  public void translateToMap() {
    if (updateIn != null) {
      updateIn.resetFlags(true, true);
      addInput("ServiceAddressAssocCatalog", ServiceAddressAssocCatalogObjHelper.toMap(updateIn, new HashMap(), "ServiceAddressAssocCatalog").get("ServiceAddressAssocCatalog"));
    }
  }


/**
 *
 * Sets the ServiceAddressAssocCatalog
 * @param updateInIn Value of the updateIn
 *
 */

  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjData updateInIn) {
    updateIn = updateInIn;
  }

  public void translateFromMap() {
    updateIn = ServiceAddressAssocCatalogObjHelper.fromMap(inputMap, "ServiceAddressAssocCatalog");
  }

/**
 *
 * Gets the ServiceAddressAssocCatalog
 * @return Value of the ServiceAddressAssocCatalog
 *
 */

  public ServiceAddressAssocCatalogObjData getServiceAddressAssocCatalog( ) {
    return updateIn;
  }

}

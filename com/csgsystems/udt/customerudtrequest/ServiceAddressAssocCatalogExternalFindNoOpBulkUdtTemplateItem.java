/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressAssocCatalogExternalFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ServiceAddressAssocCatalogExternalFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressAssocCatalogExternalFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ServiceAddressAssocCatalogObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressAssocCatalogExternalFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressAssocCatalogExternalFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ServiceAddressAssocCatalogObjectDataList noOpInIn) {
    super(id, context, "ServiceAddressAssocCatalogExternalFind");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ServiceAddressAssocCatalogObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ServiceAddressAssocCatalog", noOpIn);
      }
      addInput("ServiceAddressAssocCatalog", mapList);
    }
  }
/**
 *
 * Sets the  ServiceAddressAssocCatalog
 * @param noOpInIn ServiceAddressAssocCatalogObjectDataList to set
 *
 */
  public void setServiceAddressAssocCatalog(ServiceAddressAssocCatalogObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ServiceAddressAssocCatalog passed into the constructor
 * @return Simulated response
 *
 */
  public ServiceAddressAssocCatalogObjectDataList getServiceAddressAssocCatalog() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ServiceAddressAssocCatalogObjectHelper.fromMapList(inputMap, "ServiceAddressAssocCatalogList");
  }
}

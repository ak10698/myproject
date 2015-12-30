<div ng-controller="tabsCtrl as ctrl">
	<!--  details.html -->
	<ul class="nav nav-tabs">
		<li ng-class="{active: ctrl.isTab(1)}"><a href=""
			ng-click="ctrl.setTab(1)">VIEW</a></li>
		<li ng-class="{active: ctrl.isTab(2)}"><a href=""
			ng-click="ctrl.setTab(2)">ADD</a></li>
		<li ng-class="{active: ctrl.isTab(3)}"><a href=""
			ng-click="ctrl.setTab(3)">EDIT/DELETE</a></li>
	</ul>
	<div ng-show="ctrl.isTab(1)">
		<h3>LIST OF KEYS...</h3>
		<input type="text" ng-model="query.gg_key" placeholder="search.." />
				<select ng-model="byOrder">
					<option value="gg_key">Key</option>
					<option value="gg_value">Value</option>
					<option value="model">Module</option>
				</select>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>KEY</th>
					<th>VALUE</th>
					<th>MODULE</th>
				</tr>
			</thead>
			<tr ng-repeat="cnfg in names | filter:query | orderBy: byOrder" ">
				<td>{{ cnfg.gg_key }}</td>
				<td>{{ cnfg.gg_value }}</td>
				<td>{{ cnfg.model }}</td>
			</tr>
		</table>
	</div>
	<div  ng-show="ctrl.isTab(2)" ng-include="'transConfiguration.jsp'" class="panel panel-success panel-body col-md-6"  ng-controller="addCtrl">
		
	</div>

</div>